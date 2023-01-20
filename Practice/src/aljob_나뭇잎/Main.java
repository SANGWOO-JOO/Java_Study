package aljob_나뭇잎;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int column , row, k, value;

        Scanner scan =new Scanner(System.in);

        row = scan.nextInt();
        column = scan.nextInt();

        k = scan.nextInt(); // k수 만큼 탐색을 하는것

        int matrix [][] = new int[row][column]; // 정사각형 구역

        for( int i=0 ; i<row ; i++){

            for(int j=0;j<column;j++){
                 value = scan.nextInt();
                 matrix[i][j] = value;
            }
        }


        int arr [] = convert(matrix);

        Arrays.sort(arr);

        System.out.println(arr[k-1]);



    }

    private static int[] convert(int[][] matrix) {

        int arr[] =new int[matrix.length*matrix[0].length];  // 배열크기 할당

        for(int i=0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                arr[i*matrix[0].length+j] =matrix[i][j];
            }
        }
        return arr;

    }
}
