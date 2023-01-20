package com.DFS_BFS;
import java.util.*;
public class before_이상한_계산기 {

    private static int n; // 정점
    private static boolean[] isvisited = new boolean[1000000]; // 방문점 체크

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();

        if(n==1) System.out.println("0"); // 안 눌러도 됨
        else if(n==0) System.out.println("1"); // 한번 누르면 나옴
        else System.out.println( bfs(n) );
    }

    private static int bfs(int v) {
        // TODO Auto-generated method stub
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        int level=0;

        while(!queue.isEmpty()) {

            int qSize = queue.size();
            for(int i=0; i<qSize; i++){

                int currentNum = queue.peek();
                queue.remove();
                if(currentNum==n) return level;

                if( currentNum*2 < 100000 && !isvisited[currentNum*2] ){
                    isvisited[currentNum*2]=true;
                    queue.offer(currentNum*2 );
                }

                if( currentNum/3 != 0 && !isvisited[currentNum/3] ){
                    isvisited[currentNum/3]=true;
                    queue.offer( currentNum/3 );
                }
            }
            level++;
        }
        return -1;
    }
}
