import java.util.Scanner;

/**
 * Created by bien on 30.01.2017.
 */
public class Solution {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int arraySize = s.nextInt();
        int[] array = new int[arraySize];
        for(int i=0; i<arraySize;i++){
            array[i] = s.nextInt();
        }
        int solution = 0;
        for(int j:array){
            solution+=j;
        }
    }
}
