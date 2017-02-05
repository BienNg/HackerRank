package Algorithms;

import java.util.Scanner;

/**
 * Created by Bien-PC on 05.02.2017.
 */
public class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mod = in.nextInt();
        int array[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            array[a_i] = in.nextInt();
        }
        int counter = 0;
        for(int i=0 ; i<n-1 ; i++){
            for(int j = i+1 ; j<n ; j++){
                if((array[i] + array[j])%mod == 0){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

}
