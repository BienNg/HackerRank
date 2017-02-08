package DataStructures;

import java.util.Scanner;

/**
 * Created by bien on 08.02.2017.
 */
public class TwoDArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = new int[6][6];
        for (int i = 0;i < 6; i++){
            for(int j = 0 ; j<6 ; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        int maxSum = matrix[0][0] +
                matrix[0][1] +
                matrix[0][2] +
                matrix[1][1] +
                matrix[2][0] +
                matrix[2][1] +
                matrix[2][2];;
        for(int i=0 ; i<4 ; i++){
            for(int j=0 ; j<4; j++){
                int sum = matrix[i][j] +
                        matrix[i][j+1] +
                        matrix[i][j+2] +
                        matrix[i+1][j+1] +
                        matrix[i+2][j] +
                        matrix[i+2][j+1] +
                        matrix[i+2][j+2];
                if(maxSum < sum){
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
