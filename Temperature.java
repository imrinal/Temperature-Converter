import java.util.*;
public class Temperature {
    static Scanner scanner = new Scanner(System.in);
    static double Fahrenheit, Celsius;
    double temperature;
    public static void main(String[] args) {
        int ch;
        Temperature tmp = new Temperature();
        while(true){
            System.out.println("---------------------------------------------------------");
            System.out.println("          Welcome to the Temperature Converter!          ");
            System.out.println("---------------------------------------------------------");
            System.out.println("Please select a conversion type:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            ch = scanner.nextInt();
            System.out.println("---------------------------------------------------------");
            System.out.println("");
            
            switch (ch) {
                case 1:
                    System.out.print("Enter the temperature in Celsius: ");
                    Celsius = scanner.nextDouble();
                    System.out.println("Converting " + Celsius + "°C to Fahrenheit...");
                    System.out.println("Result: " + Celsius + "°C is equal to " + tmp.CelsiustoFahrenheit(Celsius) + "°F");
                    System.out.println("---------------------------------------------------------");
                    System.out.println("\n\n");
                    break;
                
                case 2:
                    System.out.print("Enter the temperature in Fahrenheit: ");
                    Fahrenheit = scanner.nextDouble();
                    System.out.println("Converting " + Celsius + "°F to Celsius...");
                    System.out.println("Result: " + Fahrenheit + "°F is equal to " + tmp.FahrenheittoCelsius(Fahrenheit) + "°C");
                    System.out.println("---------------------------------------------------------");
                    System.out.println("\n\n");
                    break;

                case 3:
                    System.exit(0);
                    break;
            
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
        
    }

    public double CelsiustoFahrenheit(double Celsius){
        this.temperature = (Celsius * 9/5) + 32;
        return temperature;
    }

    public double FahrenheittoCelsius(double Fahrenheit){
        this.temperature = (Fahrenheit - 32) * 5/9;
        return temperature;
    }
}
