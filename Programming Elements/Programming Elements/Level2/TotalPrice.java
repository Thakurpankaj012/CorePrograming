package Level2;
public class TotalPrice {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in); 

        System.out.print("Enter the unit price of the item: ");
        double unitPrice = input.nextDouble(); 

        System.out.print("Enter the quantity to be bought: ");
        int quantity = input.nextInt(); 

        double totalPrice = unitPrice * quantity; 

        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity is " + quantity + 
                           " and unit price is INR " + unitPrice);

        input.close();
    }
}