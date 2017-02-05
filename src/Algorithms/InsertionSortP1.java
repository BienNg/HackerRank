package Algorithms;

import java.util.Scanner;

/**
 * Created by Bien-PC on 01.02.2017.
 */
public class InsertionSortP1 {
    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        int e = ar[ar.length-1];
        for(int i = ar.length-1 ; i>=0 ; i--){
            boolean eIsFirst = true;
            if(i != 0 && ar[i-1]>e){
                ar[i] = ar[i-1];
                eIsFirst = false;
            }else if (i != 0){
                ar[i] = e;
                printArray(ar);
                break;
            }
            if(eIsFirst){
                ar[0] = e;
            }
            printArray(ar);
        }
    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
