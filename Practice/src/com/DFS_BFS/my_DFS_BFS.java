package com.DFS_BFS;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;


public class my_DFS_BFS{

    static int MAX = 1005;
    static int n;
    static int e;

    static List<ArrayList<Integer>> graph = new ArrayList<>();

    static boolean visitedDFS[] =new boolean[MAX];
    static Queue<Integer> queue = new LinkedList<>();
    static boolean visitedBFS[] = new boolean[MAX];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        e = sc.nextInt();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0;i<e ; i++){
            int a =sc.nextInt();
            int b =sc.nextInt();

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i=0;i<n;i++){
            Collections.sort(graph.get(i));
        }

        //
       DFS(0);
       System.out.println();

       BFS();

    }

    private static void BFS() {
        queue.add(0);
        visitedBFS[0]=true;

        while(queue.size()>0){

            int current = queue.poll();
            System.out.print(current + " ");

            for(int i=0;i<graph.get(current).size();i++){
                int next =graph.get(current).get(i);

                if(visitedBFS[next]==false){
                    visitedBFS[next]=true;
                    queue.add(next);
                }
            }
        }
    }

    private static void DFS(int x) {
        visitedDFS[x]=true;

        System.out.print(x + " ");

        for(int i=0;i<graph.get(x).size();i++){
            int y =graph.get(x).get(i);

            if(visitedDFS[y]==false) DFS(y);

        }
    }



}