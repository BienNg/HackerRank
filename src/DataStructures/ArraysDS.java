package DataStructures;

import java.util.Scanner;

/**
 * Created by Bien-PC on 05.02.2017.
 */
public class ArraysDS {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int [] array = new int[size];
        for(int i= size-1; i>=0 ;i--){
            array[i] = scanner.nextInt();
        }
        for (int i : array){
            System.out.print(i +" ");
        }
    }
}
