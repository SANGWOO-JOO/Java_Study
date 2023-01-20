package com.DFS_BFS;


import java.util.*;

public class test_특정_최단거리 {
//    private static int n ,m;
//    private static int a,b,c;
//    private static int A, B;

    static class graph {
        ArrayList<Integer> edges;
        ArrayList<Integer> costs;

        graph() {
            this.edges = new ArrayList<>();
            this.costs = new ArrayList<>();
        }
    }

    static graph[] graph;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, m, A, B;
        long[] candidates;

        n = sc.nextInt();
        m = sc.nextInt();

        candidates =new long[2];
        graph = new graph[n+10];


        for(int i=0; i<=n; i++){
            graph[i] =new graph();
        }

        for(int i =0 ;i<m;i++){
            int a, b, c;

            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();

            graph[a].edges.add(b);
            graph[b].edges.add(a);

            graph[a].costs.add(c);
            graph[b].costs.add(c);

        }

        A = sc.nextInt();
        B = sc.nextInt();

        candidates[0] =dijk(n,1,A) +dijk(n,A,B)+dijk(n,B,n);
        candidates[1] =dijk(n,1,B) +dijk(n,B,A)+dijk(n,A,n);

        System.out.println(candidates[0]>candidates[1]?candidates[1]:candidates[0]);
        sc.close();

    }

    private static long dijk(int n, int start, int end) {
        long[] distances= new long[n+10];
        boolean[]visited = new boolean[n+10];

        for(int i=1;i<=n;i++)
            distances[i] = 987987987; // 엄청 큰값으로..
            distances[start] = 0;

            for(int i =1 ; i<=n ;i++){
                long mincost;
                int minindex;
                mincost = 987987987;
                minindex =-1;

                for(int j=1; j<=n ;j++){
                    if(!visited[j]&&mincost>distances[j]){
                        mincost =distances[j];
                        minindex=j;
                    }
                }
                visited[minindex]=true;

                for(int j=0; j<graph[minindex].edges.size();j++){
                    int y= graph[minindex].edges.get(j);
                    int cost = graph[minindex].costs.get(j);

                    if(distances[y]>distances[minindex]+cost)
                        distances[y]=distances[minindex]+cost;
                }
            }
        return distances[end];
    }
}
