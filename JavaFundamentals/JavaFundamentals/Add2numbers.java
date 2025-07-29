import java.util.Scanner;
public class Add2numbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter 2nd Number: ");
        int num2 = sc2.nextInt();
        sc.close();
        sc2.close();
        int sum = num1 + num2;
        System.out.println("Sum of the two numbers is : " + sum);
    }
}

