package aljob_필터링;
import java.util.Scanner;

public class one{


    public static void main(String[] args){

        //입력
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();               //문자열 s 입력

        StringBuilder sb = new StringBuilder(s);   //deleteCharAt() 등 다양한 메서드를 사용하기 위해 선언
//        char[] sArray = sb.toCharArray();


        String p = scan.nextLine();   //문자열 p 입력
        char[] pArray = p.toCharArray();


        //String first = "";
        StringBuilder first = new StringBuilder();

        //String last = "";
        StringBuilder last = new StringBuilder();



        for(int i=0; i<pArray.length; i++){

            int findIdx = sb.indexOf(pArray[i]+"");   //s 문자열에서 pArray 알파벳이 존재하는 인덱스 반환

            //first = sb.substring(0,findIdx);
            first.append(sb.substring(0,findIdx));
            //System.out.print(first + " ");

            //last = sb.substring(findIdx+1);
            //sb = new StringBuilder(last);

            last = new StringBuilder(sb.substring(findIdx+1));
            //System.out.print(last + " ");
            sb = last;

            //sb.replaceAll(first, last);
        }

        System.out.println(first.append(last));
    }



}