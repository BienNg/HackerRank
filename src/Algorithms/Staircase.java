package Algorithms;

import java.util.Scanner;

/**
 * Created by bien on 30.01.2017.
 */
public class Staircase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        String output = "";
        for(int i = 0; i<size ; i++){
            for(int j=0 ; j<size-1-i; j++){
                output+=" ";
            }
            for(int k = 0; k<i+1 ; k++){
                output += "#";
            }
            output +="\n";
        }
        System.out.println(output);
    }
}
