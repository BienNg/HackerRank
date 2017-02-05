package Algorithms;

import java.util.Scanner;

/**
 * Created by Bien-PC on 01.02.2017.
 */
public class CeasarCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        String input = in.next();
        int key = in.nextInt();

        String ceasarCipher = "abcdefghijklmnopqrstuvwxyz";
        char[] array = input.toCharArray();
        for(int i=0 ; i<length ; i++){
            if(Character.isLetter(array[i])){
                if(Character.isLowerCase(array[i])){
                    int pos = ceasarCipher.indexOf(array[i]);
                    array[i] = ceasarCipher.charAt((pos+key)%26);
                }else{
                    int pos = ceasarCipher.indexOf(Character.toLowerCase(array[i]));
                    array[i] = Character.toUpperCase(ceasarCipher.charAt((pos+key)%26));
                }
            }
        }

        String output = "";
        for(char c: array){
            output += c;
        }
        System.out.println(output);
    }

}
