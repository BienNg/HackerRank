import java.util.Scanner;

/**
 * Created by bien on 30.01.2017.
 */
public class CompareTheTriplets {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int[] tripleA = {a0, a1, a2,};
        int[] tripleB = {b0, b1, b2,};

        int pointsAlice = 0;
        int pointsBob = 0;
        for(int i=0 ; i<3 ; i++){
            if(tripleA[i] > tripleB[i]){
                pointsAlice++;
            }else if(tripleA[i] < tripleB[i]){
                pointsBob++;
            }
        }

        System.out.println(pointsAlice + " " + pointsBob);
    }
}
