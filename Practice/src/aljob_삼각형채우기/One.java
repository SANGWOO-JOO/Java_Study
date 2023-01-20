package aljob_삼각형채우기;
import java.util.*;

public class One {

    public static void main(String[] args) {

        // long start = System.currentTimeMillis(); // 프로그램 시작 시간
        // 입력
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();     //삼각형 층 수
        List<Integer> list = new ArrayList<>();   //column 인덱스를 저장하는 리스트 선언
        //삼각형 숫자 입력
        int arr[][] = new int[n + 1][n + 1];
        for (int row = 0; row < n; row++) {
            int col = scan.nextInt();     //column 입력
            int value = scan.nextInt();   //값 입력
            arr[row][col] = value;        //삼각형 배열에 값 저장
        }

        //삼각형 채우기 로직
        for (int row = 0; row < n - 1; row++) {   //row는 0부터 n-1까지 반복
            for (int col = 0; col < row + 1; col++) {   //col은 0부터 row까지 반복
                //if(arr[row][col]==0) continue;  //-66제거
                //1. arr[row][col]의 바로 아래 값이 0일때
                if (arr[row + 1][col] == 0) {

                    if (arr[row + 1][col + 1] == 0) {   //arr[row][col]의 바로 대각선 아래 값이 0일때
                        list.add(col);          //list에 column 저장
                        continue;               //다음 반복으로 이동
                    } else {                     //arr[row][col]의 바로 대각선 아래 값이 0이 아니라면
                        arr[row + 1][col] = arr[row][col] - arr[row + 1][col + 1];   //arr[row][col]의 바로 아래 값을 채운다.
                    }
                }

                //2. arr[row][col]의 바로 대각선 아래 값이 0일때
                if (arr[row + 1][col + 1] == 0) {
                    arr[row + 1][col + 1] = arr[row][col] - arr[row + 1][col];      //arr[row][col]의 바로 대각선 아래 값을 채운다.
                }

                //3. 각 column당 row가 끝에 도달하고 column의 바로 아래와 대각선 아래 값이 0인 경우가 존재한다면
                if (col == row && list.size() != 0) {
                    col = list.get(0) - 1; //list에 저장된 첫번째 column 인덱스 조회후 대입 // ..column이 다음 차례에 1증가해 버리기 때문에 -1을 해주어야 한다...
                    list.remove(0);  //조회된 column 인덱스 제거
                }
            }
        }

        //삼각형 배열 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //코드 실행 종료시간을 end 변수에 담습니다
        // long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
        // System.out.println("프로그램 실행시간 : " + (end - start)/1000.0 +"초"); //실행 시간 계산 및 출력

    }
}


