package aljob_삼각형채우기;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n; // 삼각형 높이


        n = sc.nextInt();  // 삼각형 높이
        int [][] triangle = new int[n+1][n+1]; // 삼각형
        int location; // 열의 위치
        int value;
        for( int i=0;i<n;i++) {

            location =sc.nextInt();
            value = sc.nextInt();

            triangle[i][location] = value; // 해당하는

        }


//        System.out.println(triangle[0][0]);
//        System.out.println(triangle[1][1]);
//        System.out.println(triangle[2][0]);
//        System.out.println(triangle[6][5]);
//        System.out.println(triangle[7][6]);



        for(int i=0;i<n;i++ ){

            for(int j=0;j<i+1;j++){
                triangle[i][j] = triangle[i+1][j] + triangle[i+1][j+1]; //  0 0 = 1 0 + 1 +1 ;
                System.out.print(triangle[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
