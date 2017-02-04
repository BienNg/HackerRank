import java.util.Scanner;

/**
 * Created by bien on 02.02.2017.
 */
public class D2Operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.

        double taxD = taxPercent;
        double percentD = tipPercent;
        double tax = (taxD/100) * mealCost;
        double tip = (percentD/100) * mealCost;

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost + tax + tip);

        // Print your result
        System.out.println("The meal cost is " + totalCost + " dollars.");
    }
}
