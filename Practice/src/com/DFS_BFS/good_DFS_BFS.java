package com.DFS_BFS;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;



public class good_DFS_BFS {

    static int MAX = 1005;
    static int n; //정점의 개수
    static int m; //간선의 개수
    static List<ArrayList<Integer>> graph = new ArrayList<>();  //그래프 선언
    static boolean visitedDFS[] = new boolean[MAX];   //DFS 순회시 정점 방문여부 체크

    static Queue<Integer> queue = new LinkedList<>();
    static boolean visitedBFS[] = new boolean[MAX];   //BFS 순회시 정점 방문여부 체크


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        n = scan.nextInt();  //정점의 개수
        m = scan.nextInt();  //간선의 개수

        //정점 입력 및 인접리스트 연결
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i<m; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();

            graph.get(a).add(b);  //정점 연결
            graph.get(b).add(a);  //정점 연결
        }

        for(int i=0; i<n; i++){
            Collections.sort(graph.get(i));      //노드 번호가 작은 순서대로 방문하기 때문에 그래프 정렬 필요
        }

        // for(int i=0; i<n; i++){
        //     System.out.println(graph.get(i));
        // }

        DFS(0);  //노드 0번부터 DFS로 그래프 순회 시작
        System.out.println();
        BFS();   //노드 0번부터 BFS로 그래프 순회 시작

    }


    static void DFS(int x){
        //노드 0번부터 DFS로 그래프를 순회하는 깊이우선탐색 재귀함수

        visitedDFS[x] = true;  //x번 정점 방문
        System.out.print(x + " ");  //정점 x 출력

        for(int i=0; i<graph.get(x).size(); i++){

            int y = graph.get(x).get(i);   //x의 연결 요소 조회

            if(visitedDFS[y]==false){   //y정점을 방문하지 않았다면
                DFS(y);                 //y정점에 대한 DFS 그래프 순회
            }
        }
    }


    static void BFS(){
        //노드 0번부터 BFS로 그래프를 순회하는 너비우선타색 재귀함수
        //1. 시작점을 큐에다가 삽입한다.
        //2. 시작점을 색칠한다

        // BFS 시작!

        //3. 큐에서 하나를 뺸다. 얘가 우리의 현재 위치이므로 출력
        //4. 인접한 모든 정점에게 방문했는지 물어보고
        //   방문하지 않았다면, 색칠하고 큐에 삽입한다.
        //5. 모두 완료했다면 다시 3으로 돌아간다.

        queue.add(0);         //0번 노드를 큐에 삽입
        visitedBFS[0] = true;  //0번 노드 방문 체크

        while(queue.size() > 0){  //큐의 크기가 0이 아니면 계속 반복

            int current = queue.peek();  //큐의 맨앞에 값 반환
            queue.remove();             //큐의 맨 앞값 삭제
            System.out.print(current + " ");       //큐의 맨 앞값 출력

            for(int i=0; i<graph.get(current).size(); i++){

                int next = graph.get(current).get(i);  //연결된 요소 반환

                if(visitedBFS[next]==false){   //next 정점에 방문하지 않았다면
                    visitedBFS[next]=true;   //next 정점에 방문
                    queue.add(next);        //큐에 next 정점 삽입
                }
            }
        }





    }



}