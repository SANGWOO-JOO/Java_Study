package com.bruteforce;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);

        input= sc.nextInt();
        int sum=fac(input);
        System.out.print(sum);
    }
    public static int fac(int a) {
        if(a<=1) {
            return 1;
        }
        else{
            return fac(a-1)*a;
        }
    }
}
