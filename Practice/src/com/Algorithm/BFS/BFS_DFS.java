package com.Algorithm.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_DFS {
    static int[][] arr;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();   // 정점의 개수
        int M = scan.nextInt();   // 간선의 개수
        int V = scan.nextInt();   // 탐색을 시작할 정점 번호

        //인접행렬 생성
        arr = new int[N+1][N+1];
        for(int i = 0; i < M; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        visited = new boolean[N + 1];
        dfs(V);

        System.out.println();

        visited = new boolean[N + 1];
        bfs(V);
    }
    //깊이우선탐색(재귀)
    public static void dfs(int V) {
        visited[V] = true;
        System.out.print(V + " ");

        if(V == arr.length) {
            return;
        }
        for(int j = 1; j < arr.length; j++) {
            //연결은 되어있는데, 방문하지 않았다면 재귀
            if(arr[V][j] == 1 && visited[j] == false) {
                dfs(j);
            }
        }
    }

    //너비우선탐색(큐)
    public static void bfs(int V) {
        Queue<Integer> que = new LinkedList<Integer>();

        que.add(V);
        visited[V] = true;
        System.out.print(V + " ");

        while(!que.isEmpty()) {
            int temp = que.poll();
            for(int i = 1; i < arr.length; i++) {
                if(arr[temp][i] == 1 && visited[i] == false) {
                    que.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}