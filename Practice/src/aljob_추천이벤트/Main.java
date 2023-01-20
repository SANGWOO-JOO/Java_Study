package aljob_추천이벤트;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); // 학생의 수
        int m = scan.nextInt(); // 추천 정보의 수
        int k = scan.nextInt(); // 당선 기준

        List<String> list = new ArrayList<>();


        for(int i=0 ; i<=n; i++){
            String StudentName= scan.nextLine(); // 스트링 값 입력
            list.add(StudentName);
        }



//        for(int i=0; i<m ;i++){
//            list.
//
//
//        }

    }
}
