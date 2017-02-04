package Algorithms;

import java.io.*;
import java.util.*;

public class KruskalReallySpecialSubtree {
    
    
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

        //Sort the edgeList
        boolean listNotSorted;
        do{
            listNotSorted = false;
            int j = 0;
            for(int i=0 ; i<edgeList.length-j-1 ; i++){
                if(edgeList[i].weight > edgeList[i+1].weight){
                    Edge tempE = edgeList[i];
                    edgeList[i] = edgeList[i+1];
                    edgeList[i+1] = tempE;
                    listNotSorted = true;
                }
            }
            j++;
        }while(listNotSorted);


        ArrayList<Edge> specialTree = new ArrayList<>();
        specialTree.add(edgeList[0]);
        boolean[] nodeList = new boolean[nodeCounter];
        int weightCounter = 0;
        for(Edge edge : edgeList){
            if(!nodeList[edge.startNode-1] && !nodeList[edge.endNode-1]){
                nodeList[edge.startNode-1] = true;
                nodeList[edge.endNode-1] = true;
                weightCounter += edge.weight;
                //System.out.println(edge.startNode + " - " + edge.endNode);
            }
            else if(!nodeList[edge.endNode-1]){
                nodeList[edge.endNode-1] = true;
                weightCounter += edge.weight;
                //System.out.println(edge.startNode + " - " + edge.endNode);
            } else if(!nodeList[edge.startNode-1]) {
                nodeList[edge.startNode - 1] = true;
                weightCounter += edge.weight;
                //System.out.println(edge.startNode + " - " + edge.endNode);
            }
        }

        System.out.println(weightCounter);
        for(Edge i : edgeList){
            System.out.println(i.weight);
        }
    }
}
