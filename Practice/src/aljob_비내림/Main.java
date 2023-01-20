package aljob_비내림;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis(); //프로그램 시작 시간
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n]; // 배열 길이 정하기

        int max = 0 ; // max 값을 설정

        for (int i = 0; i < n; i++) {

            arr[i] = scan.nextInt(); // 한줄식 넣기

            if(max <= arr[i] ){
                max = arr[i] ;
            }

        }

        int cnt = 0;
        for (int i= n-2; -1 < i ; i--) { // 뒤에서 2번째를 i로 잡는다.
            for(int j=0 ; j < max ;j ++){  // 최대값 만큼 줄여준다

                if(arr[i] >= arr[i+1]){
                    arr[i]--;
                    cnt ++;
                }
            }
        }

        System.out.println(cnt);
        long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
        System.out.println("프로그램 실행시간 : " + (end - start)/1000.0 +"초"); //실행 시간 계산 및 출력

    }

}