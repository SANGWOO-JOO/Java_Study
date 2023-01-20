package com.DFS_BFS;
import java.util.*;
public class my_최단거리 {

    static class Graph {
        ArrayList<Integer> edges;
        ArrayList<Integer> costs;

        Graph() {
            this.edges = new ArrayList<>();
            this.costs = new ArrayList<>();
        }
    }

    static Graph[] graph;
    static boolean[] visited;
    static int[] distances;

    public static int dijkstra(int N, int start, int end) {
        for (int i = 0; i < N; i++)
            distances[i] = 987987987;
        distances[start] = 0;

        for (int i = 0; i < N; i++) {
            int minCost, minIndex;
            minCost = 987987987;
            minIndex = -1;

            for (int j = 0; j < N; j++) {
                if (!visited[j] && minCost > distances[j]) {
                    minCost = distances[j];
                    minIndex = j;
                }
            }
            visited[minIndex] = true;

            for (int j = 0; j < graph[minIndex].edges.size(); j++) {
                int y = graph[minIndex].edges.get(j);
                int cost = graph[minIndex].costs.get(j);

                if (distances[y] > distances[minIndex] + cost) distances[y] = distances[minIndex] + cost;
            }
        }

        return distances[end];
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N, M, start, end, result;
        N = scanner.nextInt();
        M = scanner.nextInt();
        graph = new Graph[N + 10];
        visited = new boolean[N + 10];
        distances = new int[N + 10];

        for (int i = 0; i < N; i++)
            graph[i] = new Graph();

        for (int i = 0; i < M; i++) {
            int a, b;
            a = scanner.nextInt();
            b = scanner.nextInt();

            graph[a].edges.add(b);
            graph[b].edges.add(a);

            graph[a].costs.add(1);
            graph[b].costs.add(1);
        }

        start = scanner.nextInt();
        end = scanner.nextInt();
        result = dijkstra(N, start, end);

        System.out.println(result);

        scanner.close();
    }
}
