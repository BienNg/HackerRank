package Algorithms;


import java.io.*;
import java.util.*;

public class BeautifulBinaryString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        StringBuilder binary = new StringBuilder(scan.next());
        int counter = 0;
        for(int i=0 ; i<=binary.length()-3 ; i++){
            
            if(binary.charAt(i) == '0' && binary.charAt(i+1) == '1' && binary.charAt(i+2) == '0'){
                binary.setCharAt(i+2,'1');
                counter++;
                i+=2;
            }
        }
        System.out.println(counter);
    }
}
