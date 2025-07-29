package Level2;
public class YardandMiles {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in); 

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble(); 

        // Convert feet to yards and miles
        double yards = distanceInFeet / 3; // 1 yard = 3 feet
        double miles = yards / 1760; // 1 mile = 1760 yards

        System.out.println("The distance is " + yards + " yards and " + miles + " miles.");

        input.close();
    }
}