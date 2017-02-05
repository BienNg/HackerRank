package Algorithms;

import java.io.*;
import java.util.*;

public class AlternatingCharacters {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();
        String[] strings = new String[lines];
        int[] deletionCounter = new int[lines];
        int deletions = 0;
        for(int i=0 ; i<lines ; i++){
            strings[i] = scan.next();
        }
        for(String s : strings){
            StringBuilder sb = new StringBuilder(s);
            for(int i=0 ; i<s.length()-1 ; i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    sb.deleteCharAt(i+1);
                    s = sb.toString();
                    deletions++;
                    i--;
                }
            }
            System.out.println(deletions);
            deletions = 0;
        }
    }
}
