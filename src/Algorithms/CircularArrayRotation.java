package Algorithms;

import java.util.Scanner;

/**
 * Created by bien on 31.01.2017.
 */
public class CircularArrayRotation {
    public static void main (String[] args) {
        /*
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int loops = in.nextInt();
        int querySize = in.nextInt();
        int[] array = new int[size];
        int[] queries = new int[querySize];

        //get the array content
        for(int i=0; i<size ; i++){
            array[i] = in.nextInt();
        }

        //get the queries
        for(int i=0 ; i<querySize ; i++){
            queries[i] = in.nextInt();
        }

        //rotate the array k times
        int[] rotatedArray = new int[size];
        for(int i=0 ; i<loops ; i++){
            rotatedArray[0] = array[size-1];
            for(int j=0 ; j<size-1; j++){
                rotatedArray[j+1] = array[j];
            }
            for(int a=0 ; a<size ; a++){
                array[a]=rotatedArray[a];
            }
        }
        for(int i=0 ; i<querySize ; i++){
            System.out.println(rotatedArray[queries[i]]);
        }
        */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] rotatedArray = new int[n];
        for(int i=0 ; i < k ; i++){
            for(int j=0 ; j<n ; j++){
                rotatedArray[(j+1)%n] = a[j];
            }
            for(int x=0 ; x<n ; x++){
                a[x] = rotatedArray[x];
            }
        }

        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(rotatedArray[m]);
        }
    }
}
