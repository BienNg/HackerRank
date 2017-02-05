package Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Bien-PC on 05.02.2017.
 */
public class SherlockAndCost {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int queries = scan.nextInt();
        ArrayList<int[]> arrayList = new ArrayList<>();
        for(int j = 0 ; j<queries ; j++){
            int size = scan.nextInt();
            int[] array = new int[size];
            for(int i = 0 ; i < size ; i++){
                array[i] = scan.nextInt();
            }
            arrayList.add(array);
        }

        for(int[] a : arrayList){
            int counter = 0;
            for(int i = 1; i<a.length ; i++){
                counter += Math.abs(a[i] - a[i-1]);
            }
            System.out.println(counter);
        }
    }
}
