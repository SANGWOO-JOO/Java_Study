package com.recursive;

import java.util.Scanner;

public class main {
    private static int Max = 105;

    private static int n, r ;
    private static char result [] = new char[Max];
    private static boolean check [] = new boolean[Max];

    static void getResult(int x){
        // x번째 for문을 돌려야한다.
        if(x>=r ){
            System.out.println(result);
        }
        else{
            for(int i=0;i<n;i++){

                char alpha = (char) (i +'a');
                if(check[i]==false){
                    result[x] =alpha;
                    check[i]= true;
                    getResult(x+1);
                    result[x]=0;
                    check[i]=false;
                }
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        r=sc.nextInt();
        getResult(0);

        return ;
    }

}
