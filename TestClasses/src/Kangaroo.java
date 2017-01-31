import java.util.Scanner;

/**
 * Created by bien on 31.01.2017.
 */
public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        boolean sameLoc = false;
        if(v1 < v2){
            while(x2 <= x1){
                if(x1==x2){
                    sameLoc = true;
                    break;
                }else{
                    x1 += v1;
                    x2 += v2;
                }
            }
        }else if(v2 < v1){
            while(x1 <= x2){
                if(x1==x2){
                    sameLoc = true;
                    break;
                }else{
                    x1 += v1;
                    x2 += v2;
                }
            }
        }
        if(sameLoc){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
