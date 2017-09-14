
/**
 * Write a description of class WeatherConditionals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class WeatherConditionals
{
    public static void getWeatherAdvice(int temperature, String description){
        boolean windy = false;
        if (description.indexOf("windy") != -1) // step 19
            windy = true;
        if (temperature > 30 && description.indexOf("windy") != -1) // step 21
            System.out.println("It's safe to go outside, " + temperature + " degrees and " + description + ".");
        else
            System.out.println("Too windy or cold! Enjoy watching the weather through the window.");
        if (description.indexOf("snow") != 1 && temperature > 100) // step 23
            System.out.println("How is this possible?");
    }
    
    public static String getHikingAdvice (int temperature, int windchill, int humidity, String description) {
        System.out.println(description.toUpperCase());
        
        if (temperature >= 65 && description.toUpperCase().equals("CLOUDY")) { 
            return("You're in San Jose.");
        }
        else if (description.toUpperCase().equals("FAIR")) {
            return("You're in Santa Fe.");
        }
        else if (temperature >= 85 && description.toUpperCase().equals("SUNNY")) {
            return("You're in Los Angeles.");
        }
        else if (humidity >= 60 && temperature <= 75) {
            return("You're in San Fransisco.");
        }
        else if (windchill <= 5 && temperature >= 95) {
            return("You're in Death Valley.");
        }
        else {
            return("Bring an Umbrella!");
        }
    }
}
