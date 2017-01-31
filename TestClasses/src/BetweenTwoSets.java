import java.util.Scanner;

/**
 * Created by bien on 31.01.2017.
 */
public class BetweenTwoSets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }

        int betweenSetsCounter = 0;
        for(int i=a[n-1] ; i<=b[0] ; i++){
            boolean isBetweenSets = true;
            for(int j:a){
                if(i%j != 0){
                    isBetweenSets = false;
                    break;
                }
            }
            if(isBetweenSets){
                for (int j:b){
                   if(j%i != 0){
                       isBetweenSets=false;
                       break;
                   }
                }
            }
            if(isBetweenSets){
                betweenSetsCounter++;
            }
        }
        System.out.println(betweenSetsCounter);
    }
}
