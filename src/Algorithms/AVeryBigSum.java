package Algorithms;

import java.util.Scanner;

/**
 * Created by bien on 30.01.2017.
 */
public class AVeryBigSum {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        long solution = 0;
        while(in.hasNextInt()){
            solution += in.nextInt();
        }
        System.out.println(solution);
    }
}
