/****************************
 * WEATHER APP              *
 * AAYUSH SOOD              *
 * JANUARY 5, 2026          *
 *                          *
 * PURPOSE: A PROGRAM WHERE *
 * YOU CAN CHECK THE        *
 * CURRENT WEATHER OF ANY   *
 * CITY IN THE WORLD        *
 ***************************/
 //--------------------------
 import java.util.Scanner;
 import java.io.IOException;
 import java.net.URI;
 import java.net.http.HttpClient;
 import java.net.http.HttpRequest;
 import java.net.http.HttpResponse;
 import java.text.MessageFormat;
 import org.json.JSONObject;
 import java.util.HashMap;
 import java.time.Instant;
 import java.time.OffsetDateTime;
 import java.time.ZoneOffset;
 import java.time.format.DateTimeFormatter;
 import io.github.cdimascio.dotenv.Dotenv;
 //--------------------------
public class WeatherApp {
    public static void main(String[] args) {
        // DEFINE VARIABLES FOR USER INPUT FOR CITY AND ABILITY TO CHECK
        // ANOTHER CITY, A TRACKER TO SEE IF THE PROGRAM IS STILL RUNNING,
        // A HASH MAP FOR STORING WEATHER DATA, AND SCANNER
            String strCity = "", strUserResponse = "";
            boolean boolActiveProgram = true;
            HashMap<String, Object> hsmWeatherData = new HashMap<>();
            
            Scanner scrInput = new Scanner(System.in);
            
        // INTRODUCE PROGRAM
            System.out.println("=====================================");
            System.out.println("\t  WEATHER APP");
            System.out.println("An app for checking the weather of\n       any city in the world!");
            System.out.println("=====================================");
            
        // PROMPT USER FOR VALID CITY
            do {
                // PROMPT USER FOR CITY AND REPLACE ALL SPACES WITH %20 SO IT CAN
                // BE PRORPELY FORMATTED FOR URL INPUT
                    System.out.print("\nEnter your desired city: ");
                    strCity = scrInput.nextLine().toLowerCase().trim().replaceAll("\\s", "%20");
                
                // CALL THE WEATHER API FUNCTION
                    hsmWeatherData = callWeatherAPI(strCity);

                // CHECK IF WEATHER DATA IS EMPTY; IF EMPTY - PROMPT USER
                // FOR A VALID CITY 
                    if (hsmWeatherData.isEmpty()) {
                        System.out.println("\nPlease enter a valid city!");
                    } else {
                        // ELSE, PROCEED WITH OUTPUTTING THE DATA TO THE USER
                        // AND ASK IF THEY WANT TO CHECK THE WEATHER OF ANOTHER
                        // CITY
                            printWeather(hsmWeatherData);
                            
                        // ASK USER IF THEY WANT TO CHECK ANOTHER CITY
                            System.out.print("\n\nDo you want to check another city? (y/n): ");
                            strUserResponse = scrInput.nextLine().toLowerCase();
                        
                        // CHECK IF USER RESPONSE IS VALID ("Y" OR "N")
                            if (strUserResponse.equals("y") || strUserResponse.equals("n")) {
                                if (strUserResponse.equals("n")) {
                                    // IF USER DOES NOT WANT TO CHECK ANOTHER CITY,
                                    // END THE PROGRAM
                                        boolActiveProgram = false;
                                }
                            } else {
                                // IF USER DOES NOT ENTER "Y" OR "N", PROMPT
                                // THEM FOR A VALID INPUT
                                    do {
                                        System.out.print("\nPlease enter a valid response! (y/n): ");
                                        strUserResponse = scrInput.nextLine().toLowerCase();
                                        
                                        if (strUserResponse.equals("n")) {
                                            // IF USER DOES NOT WANT TO CHECK ANOTHER CITY,
                                            // END THE PROGRAM
                                                boolActiveProgram = false;
                                        }
                                    } while (!strUserResponse.equals("y") && !strUserResponse.equals("n"));
                            }
                    }
            } while (boolActiveProgram);
    }
    
    // METHOD FOR PRINTING WEATHER DATA FOR A CITY TO THE USER
        public static void printWeather(HashMap<String, Object> hsmWeatherData) {
            // OUTPUT REPORT TITLE
                System.out.println("\n=====================================");
                System.out.println("\t  WEATHER REPORT");
                System.out.println("=====================================");
            
            // OUTPUT CITY, COUNTRY AND LOCAL TIME
                System.out.println("\n\tCity: " + hsmWeatherData.get("city") + ", " + hsmWeatherData.get("country"));
                System.out.println("\tTime: " + hsmWeatherData.get("time"));
                
            // OUTPUT TEMPERATURE, FEELS LIKE TEMPERATURE, AND TEMPERATURE RANGE
                System.out.println("\tTemperature: " + hsmWeatherData.get("temperature"));
                System.out.println("\tFeels Like: " + hsmWeatherData.get("feelsLike"));
                System.out.println("\tHigh: " + hsmWeatherData.get("maxTemperature"));
                System.out.println("\tLow: " + hsmWeatherData.get("minTemperature"));
                
            // OUTPUT WIND SPEED, PRESSURE, HUMIDITY, AND VISIBILITY
                System.out.println("\tWind Speed: " + hsmWeatherData.get("windSpeed"));
                System.out.println("\tPressure: " + hsmWeatherData.get("pressure"));
                System.out.println("\tHumidity: " + hsmWeatherData.get("humidity"));
                System.out.println("\tVisibility: " + hsmWeatherData.get("visibility"));
            
            // OUTPUT SUNRISE AND SUNSET TIMES
                System.out.println("\tSunrise: " + hsmWeatherData.get("sunrise"));
                System.out.println("\tSunset: " + hsmWeatherData.get("sunset"));
            
            // PRINT ENDING OF WEATHER REPORT
                System.out.println("\n=====================================");
        }
    
    // METHOD FOR CALLING THE WEATHER API
        public static HashMap<String, Object> callWeatherAPI(String strCity) {
            // DEFINE VARIABLES FOR API URL, THE WEATHER DATA REPRESENTED IN JSON, AND 
            // A HASHMAP FOR STORING WEATHER DATA
                Dotenv dotenv = Dotenv.load();

                String strApiKey = dotenv.get("API_KEY");
                String strAPIUrl = MessageFormat.format("https://api.openweathermap.org/data/2.5/weather?q={0}&appid={1}", strCity, strApiKey);
                String strData = "";
                
                HashMap<String, Object> hsmOrganizedData = new HashMap<>();
            
            // CALL THE WEATHER API TO RETRIEVE DATA IN THE FORM OF JSON
                HttpClient HCLClient = HttpClient.newHttpClient();
                HttpRequest HRQRequest = HttpRequest.newBuilder()
                    .uri(URI.create(strAPIUrl))
                    .header("Accept", "application/json")
                    .GET()
                    .build();
           
            // EXCEPTION HANDLING
                try {
                    // ATTEMPT TO RETRIEVE A RESPONSE FROM THE WEATHER API
                        HttpResponse<String> HREResponse = HCLClient.send(HRQRequest, HttpResponse.BodyHandlers.ofString());
                    
                    // IF STATUS CODE IS 200 (OK), THEN RETRIEVE WEATHER DATA
                        if (HREResponse.statusCode() == 200) {
                            // STORE DATA IN A STRING VARIABLE
                                strData = HREResponse.body();
                        } else {
                            // IF STATUS CODE IS NOT 200 (ERROR), STORE EMPTY
                            // WEATHER DATA
                                strData = "{}";
                        }
                } catch (IOException | InterruptedException e) {
                    // IF AN EXCEPTION IS CAUGHT, PRINT ERROR INFORMATION
                        e.printStackTrace();
                }
            
            // CONVERT STRING DATA INTO A JSON OBJECT FOR EASIER ACCESS OF INFORMATION
                JSONObject JSOData = new JSONObject(strData);
            
            // IF DATA IS NOT EMPTY, CALL A METHOD FOR ASSEMBLING WEATHER DATA
                if (!strData.equals("{}")) {
                    hsmOrganizedData = assembleWeatherData(JSOData);
                }
            
            // RETURN FORMATTED WEATHER DATA TO THE MAIN METHOD
            // AN EMPTY HASH MAP WOULD BE RETURNED IF NO VALID WEATHER DATA IS RETRIEVED
                return hsmOrganizedData;
        }
        
    // METHOD FOR TAKING DATA FROM THE API AND RETURNING IT IN AN ORGANIZED MANNER
        public static HashMap<String, Object> assembleWeatherData(JSONObject JSOData) {
            // DEFINE VARIABLES FOR ALL DATA POINTS SUCH AS WIND SPEED, TEMPRATURE, ETC
                String strWeatherDescription = "", strCityName = "";
                String strCountry = "", strTime = "", strConditions = "";
                String strTemp = "", strFeelsLike = "", strTempMin = "";
                String strTempMax = "", strPressure = "", strHumidity = "";
                String strVisibility = "", strWindSpeed = "", strSunrise = "";
                String strSunset = "";

                long lngUnixTimestamp = 0;
                int intTimezone = 0;
                
                HashMap<String, Object> hsmOrganizedData = new HashMap<>();
                
                DateTimeFormatter dtfTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
            
            // ASSIGN UNIX TIME AND TIMEZONE INFORMATION TO VARIABLES
                lngUnixTimestamp = JSOData.getLong("dt");
                intTimezone = JSOData.getInt("timezone");
            
            // ASSIGN CITY NAME, COUNTRY AND LOCAL TIME TO VARIABLES
                strCityName = JSOData.getString("name");
                strCountry = JSOData.getJSONObject("sys").getString("country");
                strTime = compileTime(lngUnixTimestamp, intTimezone).format(dtfTimeFormatter);
            
            // ASSIGN TEMPERATURE DATA TO THEIR RESPECTIVE VARIABLES
                if (JSOData.getJSONObject("main").has("temp")){
                    strTemp =  Integer.toString((int)convertKelvinToCelsius(JSOData.getJSONObject("main").getDouble("temp"))) + "°C";
                } else {
                    strTemp = "N/A";
                }
                
                if (JSOData.getJSONObject("main").has("feels_like")){
                    strFeelsLike =  Integer.toString((int)convertKelvinToCelsius(JSOData.getJSONObject("main").getDouble("feels_like"))) + "°C";
                } else {
                    strFeelsLike = "N/A";
                }
                
                if (JSOData.getJSONObject("main").has("temp_min")){
                    strTempMin =  Integer.toString((int)convertKelvinToCelsius(JSOData.getJSONObject("main").getDouble("temp_min"))) + "°C";
                } else {
                    strTempMin = "N/A";
                }
                
                if (JSOData.getJSONObject("main").has("temp_max")){
                    strTempMax =  Integer.toString((int)convertKelvinToCelsius(JSOData.getJSONObject("main").getDouble("temp_max"))) + "°C";
                } else {
                    strTempMax = "N/A";
                }
            
            // ASSIGN PRESSURE, HUMIDITY, AND VISIBILITY DATA TO VARIABLES
                if (JSOData.getJSONObject("main").has("pressure")){
                    strPressure =  Integer.toString((int)(JSOData.getJSONObject("main").getDouble("pressure") / 10)) + " kPa"; // Convert from hPa to kPa
                } else {
                    strPressure = "N/A";
                }
                
                if (JSOData.getJSONObject("main").has("humidity")){
                    strHumidity =  Integer.toString((int)(JSOData.getJSONObject("main").getDouble("humidity"))) + "%";
                } else {
                    strHumidity = "N/A";
                }
                
                if (JSOData.has("visibility")){
                    strVisibility =  Integer.toString((int)(JSOData.getDouble("visibility") / 1000)) + " km";  // CONVERT FROM M TO KM
                } else {
                    strVisibility = "N/A";
                }
                
            // ASSIGN WIND SPEED DATA TO A VARIABLE
                if (JSOData.getJSONObject("wind").has("speed")){
                    strWindSpeed =  Integer.toString((int)(JSOData.getJSONObject("wind").getDouble("speed") * 3.6)) + " km/h";  // CONVERT FROM M/S TO KM/H
                } else {
                    strWindSpeed = "N/A";
                }
                
            // ASSIGN SUNRISE AND SUNSET DATA TO A VARIABLE
                if (JSOData.getJSONObject("sys").has("sunrise")){
                    strSunrise = compileTime(JSOData.getJSONObject("sys").getInt("sunrise"), intTimezone).format(dtfTimeFormatter);
                } else {
                    strSunrise = "N/A";
                }
                
                if (JSOData.getJSONObject("sys").has("sunset")){
                    strSunset = compileTime(JSOData.getJSONObject("sys").getInt("sunset"), intTimezone).format(dtfTimeFormatter);
                } else {
                    strSunset = "N/A";
                }

            // ADD CITY AND COUNTRY DATA TO HASH MAP
                hsmOrganizedData.put("city", strCityName);
                hsmOrganizedData.put("country", strCountry);
            
            // ADD TEMPERATURE DATA TO HASH MAP
                hsmOrganizedData.put("temperature", strTemp);
                hsmOrganizedData.put("feelsLike", strFeelsLike);
                hsmOrganizedData.put("minTemperature", strTempMin);
                hsmOrganizedData.put("maxTemperature", strTempMax);
            
            // ADD TIME DATA TO HASH MAP
                hsmOrganizedData.put("unixTimestamp", lngUnixTimestamp);
                hsmOrganizedData.put("timezone", intTimezone);
                hsmOrganizedData.put("time", strTime);
            
            // ADD PRESSURE, HUMIDITY, AND VISIBILITY DATA TO HASH MAP
                hsmOrganizedData.put("pressure", strPressure);
                hsmOrganizedData.put("humidity", strHumidity);
                hsmOrganizedData.put("visibility", strVisibility);
            
            // ADD WIND SPEED DATA TO HASH MAP  
                hsmOrganizedData.put("windSpeed", strWindSpeed);
                
            // ADD SUNRISE AND SUNSET DATA TO HASH MAP  
                hsmOrganizedData.put("sunrise", strSunrise);
                hsmOrganizedData.put("sunset", strSunset);
            
            // RETURN ORGANIZED WEATHER DATA BACK TO API CALL METHOD
                return hsmOrganizedData;
        }
        
    
    // METHOD FOR CONVERTING TEMPERATURE MEASURED IN KELVIN TO CELSIUS (ROUNDED TO THE NEAREST WHOLE)
        public static int convertKelvinToCelsius(double dblKelvin) {
            // 1°C = 273.15K
                int intCelsius = (int)Math.round(dblKelvin - 273.15);
                
            // RETURNS CONVERTED TEMPERATURE IN CELSIUS
                return intCelsius;
        } 
        
    // METHOD FOR CONVERTING UNIX TIME TO LOCAL TIME
        public static OffsetDateTime compileTime(long lngUnixTimestamp, int intTimezone) {
            // TAKES NUMBER OF SECONDS FROM UNIX EPOCH AND RETURNS IT IN A READABLE
            // FORMAT (EX: 2026-01-14T18:33:16Z)
                Instant insInstant = Instant.ofEpochSecond(lngUnixTimestamp);
            
            // RETURNS A FIXED AMOUNT OF TIME AHEAD OR BEHIND UTC
            // THIS IS USED TO PROVIDE ACCURATE TIME IN A DIFFERENT TIMEZONE
            // THAN HALIFAX, NS
                ZoneOffset zofZoneOffset = ZoneOffset.ofTotalSeconds(intTimezone);
            
            // RETURNS UTC TIME OF THE CONVERTED TIMEZONE
                OffsetDateTime odtOffsetDateTime = insInstant.atOffset(zofZoneOffset);
            
            // RETURNS UTC TIME OF THE CITY
                return odtOffsetDateTime;
        }
}