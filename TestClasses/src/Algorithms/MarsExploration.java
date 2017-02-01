package Algorithms;

import java.util.Scanner;

/**
 * Created by Bien-PC on 01.02.2017.
 */
public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String check = "SOS";
        int counter = 0;
        for(int i=0 ; i<input.length() ; i+=3){
            for(int j=0; j<3 ; j++){
                if(input.charAt(i+j) != check.charAt(j)){
                    counter++;
                }
            }
        }
        System.out.println(counter++);
    }
}
