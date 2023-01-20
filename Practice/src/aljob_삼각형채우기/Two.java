package aljob_삼각형채우기;
import java.util.*;

public class Two {

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


    }
}