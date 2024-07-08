import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = input.nextDouble();
        System.out.print("Enter the unit of measurement (Celsius, Fahrenheit, or Kelvin): ");
        String unit = input.next().toLowerCase();

        if (unit.equals("celsius")) {
            double fahrenheit = (temperature * 9/5) + 32;
            double kelvin = temperature + 273.15;
            System.out.printf("The temperature in Fahrenheit is %.2f°F\n", fahrenheit);
            System.out.printf("The temperature in Kelvin is %.2fK\n", kelvin);
        } else if (unit.equals("fahrenheit")) {
            double celsius = (temperature - 32) * 5/9;
            double kelvin = (temperature - 32) * 5/9 + 273.15;
            System.out.printf("The temperature in Celsius is %.2f°C\n", celsius);
            System.out.printf("The temperature in Kelvin is %.2fK\n", kelvin);
        } else if (unit.equals("kelvin")) {
            double celsius = temperature - 273.15;
            double fahrenheit = (temperature - 273.15) * 9/5 + 32;
            System.out.printf("The temperature in Celsius is %.2f°C\n", celsius);
            System.out.printf("The temperature in Fahrenheit is %.2f°F\n", fahrenheit);
        } else {
            System.out.println("Invalid unit of measurement. Please enter Celsius, Fahrenheit, or Kelvin.");
        }
    }
}