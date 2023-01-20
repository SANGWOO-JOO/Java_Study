package com.aljob_숫자셔플;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String input = sc.nextLine();  // 문자열 입력

        int length = input.length(); // 입력받은 문자열 길이

        // 번갈아 생성한 문자열
        String result = "";

        // 문자열의 앞 인덱스부터 시작하는 반복문
        for (int i = 0; i < length; i++) {
            // (문자열의 길이 - 1) - i 를 하면 뒤 인덱스 값이 됨.
            int end = (length - 1) - i;

            // 앞과 뒤에서 동시에 출발하기 때문에 중앙을 넘으면 반복문이 종료되어야 함
            if (i < end) {
                // 앞 문자와 뒤 문자를 순서대로 result 변수에 저장
                char front = input.charAt(i);
                char back = input.charAt(end);

                // char 를 String 으로 변환하려면 뒤에 + "" 해주면 됨.
                result += front + "" + back + "";
            }
            // 문자열의 길이가 홀수라면 중앙의 문자는 맨 뒤로 이동시키면됨.
            else if (i == end) {
                char current = input.charAt(i);
                result += current + "";
            }
            // 모든 작업이 끝나면 반복문 종료
            else {
                break;
            }
        }

        // 출력
        System.out.println(result);
    }

}
