import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello and Welcome to your Temperature-Converter!");

        while (true) {
            //menu
            System.out.println("What conversion would you you want to do today?");
            
            System.out.println("1. Convert temperature from Celsius to Fahrenheit");
            
            System.out.println("2. Convert temperature from Fahrenheit to Celsius");
            
            System.out.print("Choose between 1 or 2 : ");
            //User input
            String choice = scanner.nextLine(); 
            if (!choice.equals("1") && !choice.equals("2")) { 
                
                System.out.println("Your choice is invalid. Please try again.");
                continue; //Return to the beginning
            }

            // Accept user input
            System.out.print("Enter the temperature to be converted: ");
            String tempInput = scanner.nextLine();

            double temperature;
            try {
                temperature = Double.parseDouble(tempInput); 
                
            } catch (NumberFormatException e) {
                System.out.println("That is not a valid number. Please try again.");
                continue; 
            }

            // Where conversion occurs.
            if (choice.equals("1")) {
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.println("The temperature provided, in Fahrenheit is: " + fahrenheit + " degree Fahrenheit");
            } else {
                double celsius = (temperature - 32) * 5 / 9;
                System.out.println("The temperature in Celsius is: " + celsius + " degree Celsius");
            }


                System.out.println("Thanks for using the Temperature Converter. Come back another time");
                break; 
            }
           scanner.close();
        }

        
    }

