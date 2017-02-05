package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Bien-PC on 05.02.2017.
 */
public class HackerLandRadioTransmitter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int radius = in.nextInt();
        int range = radius * 2 + 1;
        int[] houses = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            houses[x_i] = in.nextInt();
        }
        Arrays.sort(houses);
        boolean[] housePositions = new boolean[houses[n-1]+1];
        for(int i:houses){
            housePositions[i] = true;
        }
        int counter = 1;
        int position = houses[0];
        position += range;
        while (position <= houses[n-1]){
            while (!housePositions[position]){
                position++;
            }
            position += range;
            counter++;
        }
        System.out.println(counter);
    }
}
