package aljob_단짠단짠;

import java.util.Scanner;

public class search {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int a ;
        a = scan.nextInt();

        int b[] =new int[a];

        for(int i=0;i<a;i++){
            b[i]=scan.nextInt();
//            System.out.print(b[i]);
        }

        int sum;
        int cnt=0;
        for(int i=0;i<a;i++){

            sum =0;
            for(int j=i;j<a;j++){
                sum+=b[j];
                if(sum==0) cnt++;
               System.out.println( i + " " +j + " " +cnt);
            }
            System.out.println("-----");
        }
    }
}
