package aljob_네이버1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //입력
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int height[] = new int[n];

        for( int i=0 ; i<n ; i++){
            height[i] = scan.nextInt();
        }

        int cnt=0;  // 카운트
        int maxIdx =0; // 최대 값을 가지는 인ㄷ겍스

        for(int i=0 ; i<n ; i++ ){
            boolean flag = false;

            if(height[maxIdx]<height[i]){  // i 가 maxIdx가 클 때
                maxIdx = i;
                break;
            }

            for(int j=i+1; j<n; j++){
                if(height[maxIdx] >= height[j]){
                        flag = true; // maxIdx 인덱스 값 보다 비교하려는 값이 작다면 true 처리 .. 비행 가능거리
                    break;
                }
            }

            if(flag == true){
                cnt ++;
            }


        }

        System.out.println(cnt);
    }
}
