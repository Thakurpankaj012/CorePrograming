import java.util.Scanner;
public class CelciusToFahreneit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temp in celcius: ");
        double Celsius = sc.nextDouble();
        double Fahrenheit = (Celsius * 9/5) + 32;
        System.out.println("Fahrenheit temp is : " + Fahrenheit);
        sc.close();
    }
}
