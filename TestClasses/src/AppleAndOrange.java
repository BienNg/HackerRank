import java.util.Scanner;

/**
 * Created by bien on 31.01.2017.
 */
public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int appleTree = in.nextInt();
        int orangeTree = in.nextInt();
        int appleCounter = in.nextInt();
        int orangeCounter = in.nextInt();
        int[] apple = new int[appleCounter];
        for(int apple_i=0; apple_i < appleCounter; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[orangeCounter];
        for(int orange_i=0; orange_i < orangeCounter; orange_i++){
            orange[orange_i] = in.nextInt();
        }

        //Count apples
        int appleScore = 0;
        for(int i=0 ; i<appleCounter ; i++){
            int landingPos = appleTree+apple[i];
            if(landingPos >= start && landingPos <= end){
                appleScore++;
            }
        }

        //Count oranges
        int orangeScore = 0;
        for(int i=0 ; i<orangeCounter ; i++){
            int landingPos = orangeTree+orange[i];
            if(landingPos>=start && landingPos<=end){
                orangeScore++;
            }
        }
        System.out.println(appleScore + "\n" + orangeScore);
    }
}
