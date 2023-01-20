package com.dikstra;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bi_party {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        int m =sc.nextInt();
        int k= sc.nextInt();

        int map1[][] = new int [n+1][n+1];
        int map2[][] = new int [n+1][n+1];

        for(int i =0 ; i< m ;i++){
            int a= sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            map1[a][b]=c;
            map2[b][a]=c;
        }

        int sum =dijkstra(map1 ,k ,n);
        sum += dijkstra(map2, k,n);
    }

    private static int dijkstra(int[][] map, int k, int n) {

        int sum =0;
        int dist[]= new int [n+1]; // 최소비용 저장
        for(int i=0;i<=n;i++){
            dist[i]=Integer.MAX_VALUE; // 최대값 저장
        }
        dist[k]=0;
        Queue<Integer> q= new LinkedList<>();
        q.add(k);

        while (!q.isEmpty()){
            int tmp = q.poll();
            for(int i=1;i<=n;i++){
                if(map[tmp][i] !=0 && dist[i]>dist[tmp]+map[tmp][i]){
                    dist[i]=dist[tmp]+map[tmp][i];
                    q.add(i);
                }
            }
        }

        for(int i=1;i<=n;i++){
            if(dist[i]<Integer.MAX_VALUE)
                sum += dist[i];
        }
        return sum;
    }
}
