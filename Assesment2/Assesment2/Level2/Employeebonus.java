// Create a program to find the bonuses of employees based on their years of service.
//Hint =>
//Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
//Take salary and year of service in the year as input.
//Print the bonus amount.

import java.util.Scanner;

public class Employeebonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Bonus: Rs. " + bonus);
        } else {
            System.out.println("No bonus (service less than or equal to 5 years)");
        }
    }
}