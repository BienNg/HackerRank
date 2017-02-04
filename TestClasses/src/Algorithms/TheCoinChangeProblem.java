package Algorithms;
import java.io.*;
import java.util.*;

public class TheCoinChangeProblem {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        int size = scan.nextInt();
        int[] changes = new int[size];
        for( int i=0 ; i<size ; i++){
            changes[i] = scan.nextInt();
        }
        if(amount <= 0 || size <= 0 || changes[0] > amount){
            System.out.println("0");
        }else{
            int change = 0;
            ArrayList<Integer> changeList = new ArrayList<>();
            while(change < amount){
                
            }
        }
    }
}
