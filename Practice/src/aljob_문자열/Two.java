package aljob_문자열;

import java.util.Scanner;

public class Two {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        Scanner scan = new Scanner(System.in);

        String s =scan.nextLine();
        String p =scan.nextLine();

        int length = s.length()/p.length();
        int plength =p.length();

//        System.out.println(plength);
        sb.append(s);
//        System.out.println(sb);
//       int a =sb.indexOf(p);
//        System.out.println(a);
        int cnt=0;
        for(int i=-1; i<length; i++){
            int a =sb.indexOf(p); // 인덱스의 값

            if(sb.indexOf(p)!=-1){
                //            System.out.println(a);
                sb.delete(a,a+plength);
//            System.out.println(i +" 번째 "+ sb);
                cnt++;
            }
            else {
                System.out.println(cnt);
                break;
            }

        }

    }
}
