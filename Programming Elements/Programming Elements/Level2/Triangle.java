package Level2;
public class Triangle {
    public static void main(String[] args) {
        double base = 10.0; // Example base in inches
        double height = 5.0; // Example height in inches

        // Calculate area in square inches
        double areaInches = 0.5 * base * height;

        // Convert area to square centimeters (1 inch = 2.54 cm)
        double areaCentimeters = areaInches * (2.54 * 2.54);

        System.out.println("The area of the triangle is " + areaInches + " square inches and " + 
                           areaCentimeters + " square centimeters.");
    }
}