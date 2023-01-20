package com.bruteforce;

import java.util.Scanner;

public class binary {
    static void binary(int a) {
        if(a==0) {
            System.out.print("0");
        }
        else if(a==1) {
            System.out.print("1");
        }
        else {
            binary(a/2);
            System.out.print(a%2);
        }
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x;
        Scanner sc =new Scanner(System.in);
        x = sc.nextInt();

        binary(x);

    }
}
