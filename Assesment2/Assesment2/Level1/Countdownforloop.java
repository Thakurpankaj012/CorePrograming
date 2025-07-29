// Rewrite program 8 to do the countdown using the for-loop

import java.util.Scanner;

public class Countdownforloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the countdown number:");
        int countdown = sc.nextInt();// You can change this value to start from a different number

        for (int i = countdown; i >= 1; i--) {
            System.out.println("Countdown: " + i);
        }
    }
}
