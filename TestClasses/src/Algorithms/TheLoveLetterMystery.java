import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();
        StringBuilder[] strings = new StringBuilder[lines];
        for(int i=0 ; i<lines ; i++){
            strings[i] = new StringBuilder(scan.next());
        }
        
        for(StringBuilder string:strings){
            StringBuilder reverse = new StringBuilder(string.toString()).reverse();
            int counter = 0;
            for(int i=0 ; i<string.length()/2 ; i++){
                while(string.charAt(i) < reverse.charAt(i)){
                    char currentChar  = reverse.charAt(i);
                    currentChar--;        
                    reverse.setCharAt(i, currentChar);
                    //System.out.println(reverse.toString());
                    counter++;
                }
                while(string.charAt(i) > reverse.charAt(i)){
                    char currentChar  = reverse.charAt(i);
                    currentChar++;        
                    reverse.setCharAt(i, currentChar);
                    //System.out.println(reverse.toString());
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
