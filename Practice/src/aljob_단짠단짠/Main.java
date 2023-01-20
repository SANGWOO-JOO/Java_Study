package aljob_단짠단짠;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();  //수열의 길이

        long cnt = 0;            //수열의 합이 k가 되는 경우의 수 카운트
        int dp[] = new int[n + 1];  //1번 인덱스부터 i번 인덱스까지의 수열의 합 // 1번 인덱스 부터?? // key를 1부터 시작 .

        Map<Integer, Long> map = new HashMap<>();  //1번부터 i번까지의 구간 합의 개수

//        map.put(1,5); // 이런 구조가 아닐까??

        //부분 수열의 합이 0가 되는 경우의 수 카운트
        for (int i = 1; i <= n; i++) {
            dp[i] =  dp[i - 1] + scan.nextInt();   //dp[i] = dp[i-1] + arr[i]

            if(dp[i] == 0){   //arr[1]~arr[i]까지의 합이 0와 같으면
                cnt++;
            }
            if(map.containsKey(dp[i] - 0)==true){ //문자를 숫자로 바꿀때  0  아스키 코드 48;
                cnt += map.get(dp[i] - 0);
            }

            if(map.containsKey(dp[i])==false) {
                map.put(dp[i], 1L);
            }
            else {
                map.put(dp[i], map.get(dp[i]) + 1);
            }
        }
        System.out.println(cnt);  //수열의 합이 0이 되는 경우의 수 출력
    }
}
