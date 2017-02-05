package Algorithms;

import java.util.Scanner;

/**
 * Created by bien on 31.01.2017.
 */
public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();

        long[] allNumbers = {a,b,c,d,e};

        long min = allNumbers[0];
        long max = allNumbers[0];

        for(int i=1 ; i<5 ; i++){
            if(allNumbers[i] < min){
                min = allNumbers[i];
            }else if(allNumbers[i] > max){
                max = allNumbers[i];
            }
        }

        long maxSum = a+b+c+d+e-min;
        long minSum = a+b+c+d+e-max;

        System.out.println(minSum + " " + maxSum);
    }

}
