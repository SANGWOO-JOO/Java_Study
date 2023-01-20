package com.recursive;

import java.util.Scanner;

public class bi_이진탐색 {
    static int[] arr;
    static int[] arr2;
    static int n,q;

    static int value;
    public static void main(String[] args) {



        Scanner sc =new Scanner(System.in);

        n = sc.nextInt(); // 전체 배열 개수
        q = sc.nextInt(); // 찾고자 하는 개수

        int arr [] =new int [n];
        int arr2[] = new int [q];

        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<q;i++) {
            arr2[i]=sc.nextInt();


            int inx =binarySearch(arr, 0, n-1, arr2[i]);

            if(inx==-1) {
                System.out.print("NO");
                System.out.println();

            }
            else {
                System.out.print("YES");
                System.out.println();
            }

        }





    }
    private static int binarySearch(int arr[], int mystart, int myend, int value) {

        int start, end;
        int mid;

        if (arr[mystart] > value) {
            return -1;
        }
        else if (arr[mystart] == value) {
            return 1;
        }
        if (arr[myend] < value) {
            return -1;
        }
        else if (arr[myend] == value) {
            return 1;
        }


        start = mystart;
        end = myend;

        while(start+1<end ) {

            mid = (start + end )/2 ;

            if(arr[mid]==value)
                return 1;

            else if(arr[mid]>value) {
                end=mid;
            }

            else {
                start =mid;
            }
        }
        return -1;
    }

}
