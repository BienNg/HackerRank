import java.util.Scanner;

/**
 * Created by bien on 30.01.2017.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        //Safe the input to an array
        int[][] matrix = new int[size][size];
        for(int i = 0; i<size ; i++){
            for(int j=0; j<size ; j++){
                matrix[i][j] = in.nextInt();
            }
        }

        //Calculate the first diagonal
        int firstDiagonal = 0;
        for(int i=0; i<size ; i++){
            firstDiagonal += matrix[i][i];
        }

        //Calculate the second diagonal
        int secondDiagonal = 0;
        for(int i=0 ; i<size ; i++){
            secondDiagonal += matrix[i][size-1-i];
        }

        //Difference between the diagonals
        int solution = Math.abs(firstDiagonal - secondDiagonal);
        System.out.println(solution);
    }
}
