package com.DFS_BFS;
import java.util.*;
public class test_미로찾기 {
    private static int n;
    private static int m;

    private static int[][] arr;
    private static boolean[][] isvisited;

    private static int[] dy = {-1, 1, 0, 0};
    private static int[] dx = {0, 0, -1, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); //세로
        m = sc.nextInt(); //가로

        arr = new int[n][m];
        isvisited = new boolean[n][m];

        for(int i =0 ;i<n; i++){
            for(int j=0;j<m;j++){
                arr[i][j] =sc.nextInt();
            }
        }

        BFS(n-1 ,0); // n-1 , 0 시작
        System.out.println(arr[0][m-1]);
    }

    private static void BFS(int i, int j) {
        Queue<int[]>queue = new LinkedList<>();
        queue.add(new int[] {i,j}); // queue 안에 y,x 순서대로 초기화
        isvisited[i][j]=true;

        while(!queue.isEmpty()){
            int[] now =queue.poll(); // 꺼내기

            for(int k=0;k<4;k++){
                int y=now[0]+dy[k];
                int x=now[1]+dx[k];

                if(y>=0&&y<n&&x>=0&&x<m){
                    if(arr[y][x]==0&&!isvisited[y][x]){
                        queue.add(new int []{y,x});
                        isvisited[y][x] =true;
                        arr[y][x] =arr[now[0]][now[1]]+1;
                    }
                }
            }


        }


    }
}
