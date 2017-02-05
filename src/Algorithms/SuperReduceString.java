package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by bien on 31.01.2017.
 */
public class SuperReduceString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        char[] chars = input.toCharArray();

        ArrayList<Character> arrayList = new ArrayList<>();

        for(char a : chars){
            arrayList.add(a);
        }

        for(int i=0 ; i<arrayList.size()-1 ; i++){
            if(arrayList.get(i) == arrayList.get(i+1)){
                arrayList.remove(i+1);
                arrayList.remove(i);
                i=-1;
            }
        }

        String output = "";
        if(!arrayList.isEmpty()){
            for(char c : arrayList){
                output += c;
            }
            System.out.println(output);
        }else{
            System.out.println("Empty String");
        }
    }
}
