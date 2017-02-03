import java.io.*;
import java.util.*;

public class Solution {
    
    
    static class Edge{
        int startNode;
        int endNode;
        int weight;
        
        public Edge(int s , int e, int w){
            startNode = s;
            endNode = e;
            weight = w;
        }
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int nodeCounter = scan.nextInt();
        int edgeCounter = scan.nextInt();
        Edge[] edgeList = new Edge[edgeCounter];
        for(int i = 0; i<edgeCounter ;i++){
            edgeList[i] = new Edge(scan.nextInt(), scan.nextInt(), scan.nextInt());
        }
        for(int i=0 ; i<edgeList.length-i+1 ; i++;){
            Edge tempE = edgeList[j];
            edgeList[j] = edgeList[j+1];
            edgeList[j+1] = tempE;
        }
            
        for(Edge e : edgeList){
            System.out.println(e.weight);
        }
    }
}
