package aljob_삼각형채우기;

import java.util.*;

public class Three{

    public static void main(String[] args){

        //입력
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();     //삼각형 층 수
        List<Integer> list = new ArrayList<>();   //column 인덱스를 저장하는 리스트 선언

        //삼각형 숫자 입력
        int arr[][] = new int[n+1][n+1];

        for(int row=0; row<n; row++){
            int col = scan.nextInt();     //column 입력
            int value = scan.nextInt();   //값 입력

            arr[row][col] = value;        //삼각형 배열에 값 저장

            list.add(col);               //리스트에 column 입력
        }


        //삼각형 채우기 로직
        for(int row=0; row<n; row++){   //row는 0부터 n-1까지 반복

            //(각 row에서 입력받은 colmun 값을 기준으로 왼쪽 colmun들은) 오른쪽에서 왼쪽 방향으로 가면서
            for(int col=list.get(row)-1; col>-1; col--){   //col은 0부터 row까지 반복
                arr[row][col] = arr[row-1][col] - arr[row][col+1];      //배열의 값을 채웁니다.
            }
            //(각 row에서 입력받은 colmun 값을 기준으로 오른쪽 colmun들은) 왼쪽에서 오른쪽 방향으로 가면서
            for(int col=list.get(row)+1; col<row+1; col++){
                arr[row][col] = arr[row-1][col-1] - arr[row][col-1];      //배열의 값을 채웁니다.
            }
        }


        //삼각형 배열 출력
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
}