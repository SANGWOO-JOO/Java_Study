package com.Test;

import java.util.Scanner;

public class bi_숫자야구 {
    static BaseBall[] box ;
    static int n ;


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        scan.nextLine();
        box = new BaseBall[n];

        int answer = 0 ;

        for ( int i = 0 ; i < n ; i ++ ) {
            box[i]= new BaseBall(scan.nextLine().split(" "));
        }

        for ( int i = 123 ; i < 987; i++ ) {

            String s = String.valueOf(i);

            String[] sS = s.split("");

            int i0 = Integer.valueOf(sS[0]);
            int i1 = Integer.valueOf(sS[1]);
            int i2 = Integer.valueOf(sS[2]);

            if ( i0 == i1 || i0 == i2 || i1 == i2 || ( i0 == 0 || i1 == 0 || i2 == 0 )  ) {
                continue;
            }

            boolean result = check(sS);

            if( result ) answer++;
        }

        System.out.println(answer);
    }


    static class BaseBall{

        int[] data = new int[3];

        int strike = 0 ;
        int ball = 0 ;


        BaseBall(String[] input){

            this.strike = Integer.valueOf(input[1]);
            this.ball= Integer.valueOf(input[2]);

            String[] datas = input[0].split("");

            for( int i = 0 ; i < 3; i ++ ) {
                this.data[i] = Integer.valueOf(datas[i]);

            }
        }
    }

    static boolean check( String[] input ) {


        int[] result = new int[2];


        for( int i = 0 ; i < n; i ++ ) {
            int[] workingData = box[i].data;
            result = new int[2]; // [ strike , ball ]

            for( int j = 0 ; j < 3; j ++ ) {

                int workingInput = Integer.valueOf(input[j]);

                for ( int k = 0; k < 3; k++ ) {

                    if ( workingData[k] == workingInput ) {
                        if(k==j) {
                            result[0] ++;
                        }else result[1] ++;
                    }
                }
            }

            if( !( box[i].strike == result[0] && box[i].ball == result[1]) ) return false;
        }

        return true;
    }
}
