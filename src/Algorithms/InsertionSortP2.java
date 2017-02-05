package Algorithms;

import java.util.Scanner;

/**
 * Created by Bien-PC on 01.02.2017.
 */
public class InsertionSortP2 {

    public static void insertionSortPart2(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            int j = i;
            do {
                if (j != 0) {
                    if (ar[j] < ar[j - 1]) {
                        int temp = ar[j];
                        ar[j] = ar[j - 1];
                        ar[j - 1] = temp;
                        j--;
                    } else {
                        printArray(ar);
                        break;
                    }
                }else{
                    printArray(ar);
                    break;
                }
            }while (true);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertionSortPart2(ar);

    }
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
