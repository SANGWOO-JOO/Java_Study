package aljob_팰린드롬;
import java.io.*;

public class Two {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        /*
         1. if(resFlag == true) 조건이 성립하면 계속
         */


        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        String[] getStr = br.readLine().split(""); //문자열로 받고 split메소드를 이용해서 공백을 기준으로 잘라서 활용.
        boolean resFlag = isPalindrome(getStr); // resFlag 기본값 false인데
        if(resFlag == true) {
            boolean resFlag2 = isPalindrome(getStr);
        } else {
            // 출력

        }
    }
   /*
     부분으로 나누어 팰린드롬

     abc ef efabc  // 예제



    */



    private static boolean isPalindrome(String[] str) {

        int originLength  = str.length; // 전체 길이
        int halfLengthVal = originLength / 2;  // 중간 길이

        for(int i=halfLengthVal;-1 > i;i--) {
            if(!str[i].equals( str[originLength-halfLengthVal-1] ))return false; //if(!a.equals(b)) a!=b
        }
        return true;
    }

}
