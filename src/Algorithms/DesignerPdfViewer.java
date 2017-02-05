package Algorithms;

import java.util.Scanner;

/**
 * Created by bien on 31.01.2017.
 */
public class DesignerPdfViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();

        int maxHeight = 0;
        for(int i=0 ; i<word.length() ; i++){
            if(h[i] > maxHeight){
                maxHeight = h[i];
            }
        }

        System.out.println(word.length()*maxHeight);
    }

}
