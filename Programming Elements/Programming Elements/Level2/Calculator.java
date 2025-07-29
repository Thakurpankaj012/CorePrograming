package Level2;
public class Calculator {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in); 

        System.out.print("Enter first number: ");
        double number1 = input.nextDouble(); 

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble(); 

        double addition = number1 + number2; 
        double subtraction = number1 - number2; 
        double multiplication = number1 * number2; 
        double division = number1 / number2; 

        System.out.println("The addition, subtraction, multiplication and division value of " + 
                           number1 + " and " + number2 + " is " + 
                           addition + ", " + subtraction + ", " + 
                           multiplication + ", and " + division);

        input.close(); 
    }
}