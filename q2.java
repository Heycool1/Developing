import java.util.Scanner;
public class q2 {
    public static double toCelcius(double temp ,char scale) {
        if (scale == 'F' || scale == 'f'){
            return(temp -32 ) * 5 / 9;
        }else if (scale == 'K' || scale == 'k'){
            return(temp - 273);
        }else{
            return temp;
        }
    }
    public static double fromCelsiusToFahrenheit(double celcius){
        return celcius * 9.0 / 5.0 + 32;
    }
    public static double fromCelciusToKelvin(double celcius){
        return celcius + 273;
    }
    public static void convertTemperature(double temp ,char scale){
        double celcius = toCelcius(temp, scale);
        System.out.printf("Temperature in Celsius: %.2f C\n", celcius);
        System.out.printf("Temperature in Fahrenheit: %.2f F\n", fromCelsiusToFahrenheit(celcius));
        System.out.printf("Temperature in Kelvin: %.2f K\n", fromCelciusToKelvin(celcius));
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature value");
        double temp = scanner.nextDouble();
        System.out.println("Enter the scale(C,F,K)");
        char scale = scanner.next().charAt(0);
        convertTemperature(temp,scale);

    }
}
