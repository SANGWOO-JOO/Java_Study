package aljob_필터링;

import java.util.Scanner;

public class two {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();//문자열 s 입력

        StringBuffer sb = new StringBuffer(s);

        String p = scan.nextLine();   //문자열 p 입력
        char[] pArray = p.toCharArray();

        StringBuffer first = new StringBuffer();

        for(int i=0; i<pArray.length; i++){

            int findIdx = sb.indexOf(pArray[i]+"");   //s 문자열에서 pArray 알파벳이 존재하는 인덱스 반환

            first.append(sb.substring(0,findIdx));
//            sb = new StringBuffer(sb.substring(findIdx+1));
            sb.delete(0,findIdx+1);
        }

        System.out.println(first.append(sb));
    }

}

