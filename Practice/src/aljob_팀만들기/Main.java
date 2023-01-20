package aljob_팀만들기;
/*
유니는 N명의 사람 중 다섯 명을 뽑아 개발팀을 구성하려고 한다.
개발팀에는 다섯가지 업무가 있다. 각 사람마다 이 다섯가지 업무를 얼만큼 잘 할 수 있는지에 대한 능력치가 존재한다.
유니가 뽑은 다섯 명의 사람은 각자 다른 업무를 진행해야 한다. 개발팀은 업무가 너무 많아서 다른 사람의 업무를 도와주는 것은 불가능하다.
이 팀의 능력치는 각 사람이 담당한 업무에 대한 능력치들의 합이다. 팀의 능력치가 최대가 되도록 사람을 선별할 때 팀의 능력치를 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {

     static int a;


    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        a =sc.nextInt(); // 처음 줄 값

//        b=sc.nextInt();

        int[][] arr = new int[a][5];
        int []sum = new int [a];

        for(int i=0;i<a;i++){
            for(int j=0;i<5;j++){

              arr[i][j]=sc.nextInt();

            }
        }
//
        for(int i=0;i<5;i++){
            for(int j=0;j<a;j++){
                sum[i]+=arr[j][i];
            }
        }
        int maxnum =sum[0];

        // 최대값 구하기
        for (int num : sum) {
            if (num > maxnum) {
                maxnum = num;
            }
        }

        System.out.println(maxnum);


    }
}
