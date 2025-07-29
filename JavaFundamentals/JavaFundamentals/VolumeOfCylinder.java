import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.print("Enter radius: ");
        double Radius = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double Volume = 3.14 * Radius * Radius * height;
        System.out.println("Volume of Cylinder is : " + Volume);
        sc.close();
    }
}
