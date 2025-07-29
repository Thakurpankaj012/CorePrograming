import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter radius: ");
        double Radius = sc.nextDouble();
        sc.close();
        double Area = 3.14 * Radius*Radius;
        System.out.println("Area of Circle is : " + Area);


    }
}
