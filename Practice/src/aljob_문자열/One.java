package aljob_문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class One{

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String s = br.readLine(); // 문자열 s 넣기
        String p = br.readLine();

        int cnt =0;

//        int length =s.length()/p.length();

        for(int i=0;i<s.length()/p.length();i++){

            System.out.println(s.length()/p.length());
            System.out.println(i);
            System.out.println("----");
            if(s.contains(p)){
                cnt ++;
                String a =s.replaceFirst(p,"");
                // 1. s 문자열에서 p 문자열을 어떻게 삭제할지 ,,
                // 2. s =(s 변수에 s문자열에서 p를 삭제한 문자열 대입.)
                s=a;
            }
            else{
                break;
            }
//            System.out.println(s);
//            System.out.println(p);
        }
//        System.out.println("=====");
        System.out.println(cnt);

    }
}