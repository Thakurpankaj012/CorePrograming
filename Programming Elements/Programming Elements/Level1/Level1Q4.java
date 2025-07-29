// Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191.
//Hint =>
//Use a single print statement to display multiline text and variables.
//Profit = selling price - cost price
//Profit Percentage = profit / cost price * 100
//I/P => NONE
//O/P =>

public class Level1Q4 {
    public static void main(String[] args) {
        // Given values
        int costPrice = 129;
        int sellingPrice = 191;

        // Calculating profit
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit * 100.0) / costPrice;

        // Output in a single multiline statement
        System.out.println(
                "Cost Price: INR " + costPrice + "\n" +
                        "Selling Price: INR " + sellingPrice + "\n" +
                        "Profit: INR " + profit + "\n" +
                        "Profit Percentage: " + profitPercentage + "%"
        );
    }
}

