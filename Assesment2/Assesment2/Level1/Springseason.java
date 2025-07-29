// Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
//Hint =>
//Spring Season is from March 20 to June 20

import java.util.Scanner;

public class Springseason {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.println("Enter day (1-31): ");
        int day = sc.nextInt();
        sc.close();

        boolean isSpringSeason = month >= 3 && month <= 6 && day >= 20 && day <= 31;
        System.out.println(isSpringSeason? "Its a Spring Season" : "Not a Spring Season");
        if (month == 3 && day < 20) {
            System.out.println("Not a Spring Season");
        } else if (month == 6 && day > 20) {
            System.out.println("Not a Spring Season");
        } else if (month < 3 || month > 6) {
            System.out.println("Not a Spring Season");
        } else {
            System.out.println("Its a Spring Season");
        }
    }
}
