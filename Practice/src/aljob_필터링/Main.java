package aljob_필터링;

import java.util.Scanner;
/*
1. S문자열에서 P문자열을 찾으면
2. S문자열에서 찾아진 문자열의 인덱스를 포함한 앞의 문자열들을 기록
3. S문자열은 찾아진 문자열의 다음 인덱스 값 문자열들로 셋팅
4. 다시 1번으로 이동
 */


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();//문자열 s 입력

        StringBuffer sb = new StringBuffer(s);

        String p = scan.nextLine();   //문자열 p 입력
        char[] pArray = p.toCharArray();

        StringBuffer first = new StringBuffer();

        for(int i=0; i<pArray.length; i++){ // pArray 배열 길이 만큼 돌아야한다. //par. 삭제하는 문자만큼 돌아야한다
            int findIdx = sb.indexOf(pArray[i] +"");   //s 문자열에서 pArray 알파벳이 존재하는 인덱스 반환  // pArray[i] => 이 값에 대한 인덱스를 변수에 넣음 (특정 문자 위치 찾기)

            System.out.println("findIdx= " + findIdx);

                first.append(sb.substring(0,findIdx)); //findIdx -1 인덱스 번지까지 붙인다.
//            sb = new StringBuffer(sb.substring(findIdx+1));
            sb.delete(0,findIdx+1); ////findIdx  인덱스 번지까지 삭제.
        }

        System.out.println(first.append(sb));
    }

}

