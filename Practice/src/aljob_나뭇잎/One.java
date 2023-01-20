package aljob_나뭇잎;

import java.util.Scanner;

public class One {

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

        int mini=0; // 최소값

        int columX[] = { -1, 1, 0, 0 };  //x좌표
        int rowY[] = { 0, 0, 1, -1 };  //y좌표

        for( int i=0 ; i<row ; i++) {

            for (int j = 0; j < column; j++) {


//                if(matrix[0][j] || matrix[row-1][j] || mini > matrix[i][column-1] || mini > matrix[i][0]){
//                    mini = matrix[i][j];
//                }


            }
        }


    }
}
