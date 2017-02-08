package DataStructures;

import java.util.Scanner;

/**
 * Created by bien on 08.02.2017.
 */
public class LeftRotation {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int rotations = scanner.nextInt();
        int[] array = new int[size];
        for(int i = 0 ; i<size ; i++) {
            array[Math.abs(i+size-rotations)%size] = scanner.nextInt();
        }
        for(int j : array){
            System.out.println(j);
        }
    }
}
