package Algorithms;

import java.util.Scanner;

/**
 * Created by Bien-PC on 05.02.2017.
 */
public class Candies {
    static int[]candies;
    static int[] kids;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        kids = new int[size];
        for(int i=0 ; i<size ; i++){
            kids[i] = scan.nextInt();
        }
        candies = new int[size];
        for (int i=0 ; i<size ; i++){
            candies[i]=1;
        }
        boolean notOkay;
        do{
            notOkay = false;
            for(int i = 0; i<size ; i++){
                boolean checker = checkNeighbours(i);
                if(checker == false){
                    notOkay = true;
                }
            }
        }while (notOkay);
        int amount = 0;
        for (int i:candies){
            amount += i;
        }
        System.out.println(amount);

/*
        for(int i = 0 ; i<size ; i++){
            System.out.println("kid: " + kids[i] + " candies: " + candies[i]);
        }
*/
    }
    private static boolean checkNeighbours(int i){
        boolean okay = true;
        if(i!=0 && i!= kids.length-1){
            if(kids[i] > kids[i-1]){
                while(candies[i] <= candies[i-1]){
                    candies[i]++;
                    okay = false;
                }
            }if(kids[i] > kids[i+1]){
                while(candies[i] <= candies[i+1]){
                    candies[i]++;
                    okay = false;
                }
            }if(kids[i] < kids[i+1]){
                while(candies[i] >= candies[i+1]){
                    candies[i+1]++;
                    okay = false;
                }
            }if(kids[i] < kids[i-1]){
                while(candies[i] >= candies[i-1]){
                    candies[i-1]++;
                    okay = false;
                }
            }
        }else if(i==0){
            if(kids[i] > kids[i+1]){
                while(candies[i] <=candies[i+1]){
                    candies[i]++;
                    okay = false;
                }
            }
        }else if(i==kids.length-1){
            if(kids[i] > kids[i-1]){
                while(candies[i] <=candies[i-1]){
                    candies[i]++;
                    okay = false;
                }
            }
        }
        return okay;
    }
}
