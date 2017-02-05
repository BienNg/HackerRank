package Algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Bien-PC on 01.02.2017.
 */
public class JourneyToTheMoon {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int nAstros = in.nextInt();
        int lines = in.nextInt();
        ArrayList<HashSet<Integer>> countries = new ArrayList<>();
        ArrayList<int[]> pairs = new ArrayList<>();

        //Reading out the given pairs
        for(int i=0 ; i<lines; i++){
            pairs.add(new int[2]);
            pairs.get(i)[0] = in.nextInt();
            pairs.get(i)[1] = in.nextInt();
        }

        //Initializing first country with the first pair
        countries.add(new HashSet<Integer>());
        countries.get(0).add(pairs.get(0)[0]);
        countries.get(0).add(pairs.get(0)[1]);

        //Compairung the known countries with the new austronauts
        for(int i=0 ; i<countries.size() ; i++){
            boolean newCountry = true;
            for(int j = 0 ; j<pairs.size(); j++){
                if(countries.get(i).contains(pairs.get(j)[0]) ||countries.get(i).contains(pairs.get(j)[1]) ){
                    countries.get(i).add(pairs.get(j)[0]);
                    countries.get(i).add(pairs.get(j)[1]);
                    pairs.remove(j);
                    i--;
                    newCountry = false;
                    break;
                }
            }
            if(newCountry && pairs.size() != 0){
                countries.add(new HashSet<Integer>());
                countries.get(countries.size()-1).add(pairs.get(0)[0]);
                countries.get(countries.size()-1).add(pairs.get(0)[1]);
                pairs.remove(0);
            }
        }

        int[] countrySizes = new int[countries.size()];
        for(int i=0 ; i<countries.size() ; i++){
            countrySizes[i] = countries.get(i).size();
        }


        //Calculate single Astonauts
        int knownAstros = 0;
        for(int i: countrySizes){
            knownAstros+=i;
        }

        int singleAstros = nAstros - knownAstros;
        //Calculating the possible combinations
        long output = 0;
        for(int i=0 ; i<countrySizes.length ; i++){
            int thisCountry = countrySizes[i];
            for(int j=i+1 ; j<countrySizes.length ; j++){
                output += thisCountry*countrySizes[j];
            }
            output += thisCountry*singleAstros;
        }


        //System.out.println(output);
        System.out.println(output);
    }
}
