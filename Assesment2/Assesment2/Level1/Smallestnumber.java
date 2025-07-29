// Write a program to check if the first is the smallest of the 3 numbers.
//I/P => number1, number2, number3
//O/P => Is the first number the smallest? ____

public class Smallestnumber {
    public static void main(String[] args)
    {
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;

        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
    }
}
