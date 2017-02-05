package Algorithms;

import java.util.Scanner;

/**
 * Created by bien on 30.01.2017.
 */
public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        float posCounter = 0;
        float negCounter = 0;
        float zeroCounter = 0;

        for(int i=0; i<size; i++){
            int nextInt = in.nextInt();
            if(nextInt > 0){
                posCounter++;
            }else if(nextInt == 0){
                zeroCounter++;
            }else{
                negCounter++;
            }
        }

        System.out.println(posCounter/size +"\n" + negCounter/size + "\n" +zeroCounter/size + "\n");

    }
}
