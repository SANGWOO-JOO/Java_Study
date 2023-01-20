package com.DFS_BFS;

import java.util.*;

public class bi_이상한_계산기 {

    static private int n; //숫자 입력
    static private int level;
    static private int current;
    private static boolean[] isvisited = new boolean[1000000]; // 방문점 체크

    static List<ArrayList<Integer>> graph = new ArrayList<>();  //그래프 선언
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        n =scan.nextInt();

        if(n==1) System.out.println("0"); // 안 눌러도 됨
        else if(n==0) System.out.println("1"); // 한번 누르면 나옴
        else System.out.println( bfs(n));
    }

        private static int bfs(int x) {
        Queue<Integer> queue =new LinkedList<>();

        queue.add(1); // 1부터 시작한다 할때
        int level=0; // 길이 0으로 초기화

        while(!queue.isEmpty()){
//            int qsize =queue.size(); // 큐 크기 선언
            for(int i =0 ; i<queue.size(); i++){ // 큐 길이만큼 돈다.
                current = queue.peek();
                queue.remove();

                if(current == n ) return level;
                // 아니라면 ..
                if( current*2 < 100000 && !isvisited[current*2] ){
                    isvisited[current*2]=true;
                    queue.add(current*2 );
                }

                if( current/3 != 0 && !isvisited[current/3] ){
                    isvisited[current/3]=true;
                    queue.add( current/3 );
                }
            }
            level++;
        }
        return -1;
    }

}
