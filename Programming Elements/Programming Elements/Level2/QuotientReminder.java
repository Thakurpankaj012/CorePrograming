package Level2;
public class QuotientReminder {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in); 

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt(); 

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt(); 

        int quotient = number1 / number2; 
        int remainder = number1 % number2; 

        System.out.println("The quotient of " + number1 + " and " + number2 + " is " + quotient + 
                           " and the remainder is " + remainder);

        input.close();
    }
    
}
