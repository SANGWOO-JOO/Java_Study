package aljob_추천이벤트;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); // 학생의 수
        int m = scan.nextInt(); // 추천 정보의 수
        int k = scan.nextInt(); // 당선 기준

        for(int i=0;i<n;i++){
            String name = scan.nextLine();
            sb.append(name);
//            sb.toString();
        }
        for(int i=0;i<n;i++){
//            sb.append(i);
//            System.out.println(sb.indexOf());
        }


    }
}
