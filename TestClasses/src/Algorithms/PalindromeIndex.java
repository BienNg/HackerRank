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
        
        for(StringBuilder s : strings){
            StringBuilder reverse = new StringBuilder(s.toString()).reverse();
            if(s.toString().equals(reverse.toString())){
                System.out.println("-1");
            }else{
                for(int i=0 ; i<s.length() ; i++){
                    StringBuilder tempString = new StringBuilder(s.toString());
                    tempString.deleteCharAt(i);
                    StringBuilder reverseTemp = new StringBuilder(tempString.toString()).reverse();
                    if(tempString.toString().equals(reverseTemp.toString())){
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}
