package ThirtyDaysOfCode;

import java.util.Scanner;

/**
 * Created by bien on 10.02.2017.
 */
public class BinaryNumbers {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
         Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int decimal = scan.nextInt();

        int counter = 0;
        int maxConsecutive = 0;
        while(decimal >= 1){
            int remainder = decimal%2;
            if(remainder == 1){
                counter++;
            }else{
                counter = 0;
            }
            maxConsecutive = Math.max(counter,maxConsecutive);
            decimal = decimal/2;
        }

        System.out.println(counter);
    }
}
