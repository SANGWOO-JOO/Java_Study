package com.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class Graph {
    private ArrayList<ArrayList<Integer>> graph;

    public Graph(int nodeSize) {
        graph = new ArrayList<>();

        for(int i = 0; i < nodeSize + 1; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void put(int n, int m) {
        graph.get(n).add(m);
        graph.get(m).add(n);
    }

    public ArrayList<Integer> getNode(int n) {
        return graph.get(n);
    }
}

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static int node;
    private static int rootNum;

    private static Graph graph;
    private static int[] visitedHeight;

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        rootNum = Integer.parseInt(st.nextToken());

        graph = new Graph(node);
        visitedHeight = new int[node];
        Arrays.fill(visitedHeight, -1);

        for(int i = 0; i < node-1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.put(a, b);
        }

        dfs(rootNum, 0);

        int max = -987987987;
        for(int i = 0; i < node; i++) {
            if(max < visitedHeight[i]) max = visitedHeight[i];
        }

        bw.write(max + " ");
        br.close();
        bw.flush();
        bw.close();
    }

    private static void dfs(int v, int height) {
        visitedHeight[v] = height;
        for(int i = 0; i < graph.getNode(v).size(); i++) {
            int w = graph.getNode(v).get(i);
            if(visitedHeight[w] == -1) {
                dfs(w, height+1);
            }
        }
    }

}