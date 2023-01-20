package com.dikstra;
import java.util.*;
public class bi_특정한_최단거리 {


    static class Graph {
        ArrayList<Integer> edges;
        ArrayList<Integer> costs;

        Graph() {
            this.edges = new ArrayList<>();
            this.costs = new ArrayList<>();
        }
    }

    static Graph[] graph;

    public static long dijkstra(int N, int start, int end) {
        long[] distances = new long[N + 10];
        boolean[] visited = new boolean[N + 10];

        for (int i = 1; i <= N; i++)
        distances[i] = 987987987;
        distances[start] = 0;

        for (int i = 1; i <= N; i++) {
            long minCost;
            int minIndex;
            minCost = 987987987;
            minIndex = -1;

            for (int j = 1; j <= N; j++) {
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

        int N, M, A, B;

        long[] candidates;
        N = scanner.nextInt();
        M = scanner.nextInt();
        candidates = new long[2];
        graph = new Graph[N + 10];

        for (int i = 0; i <= N; i++)
            graph[i] = new Graph();

        for (int i = 0; i < M; i++) {
            int a, b, c;
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();

            graph[a].edges.add(b);
            graph[b].edges.add(a);

            graph[a].costs.add(c);
            graph[b].costs.add(c);
        }

        A = scanner.nextInt();
        B = scanner.nextInt();

        candidates[0] = dijkstra(N, 1, A) + dijkstra(N, A, B) + dijkstra(N, B, N);
        candidates[1] = dijkstra(N, 1, B) + dijkstra(N, B, A) + dijkstra(N, A, N);

        System.out.println(candidates[0] > candidates[1] ? candidates[1] : candidates[0]);

        scanner.close();
    }
}
