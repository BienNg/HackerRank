package Algorithms;

import java.util.Scanner;

/**
 * Created by bien on 31.01.2017.
 */
public class CamelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        char[] inputArray = s.toCharArray();
        int wordCounter = 1;
        for(char c:inputArray){
            if(Character.isUpperCase(c)){
                wordCounter++;
            }
        }
        System.out.println(wordCounter);
    }
}
