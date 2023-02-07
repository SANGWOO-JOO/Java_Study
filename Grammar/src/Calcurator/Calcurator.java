package Calcurator;

import java.util.ArrayList;
import java.util.Scanner;

public class Calcurator {
    public static void main(String[] args) {
        //사칙 연산
        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine(); // 값(문자열) 입력
        String[] values = value.split(" "); // 문자열 분리

            int[] num = new int[value.length()];
    //      int[] result = new int[value.length()];


            int size = values.length;
            int startnumber =Integer.parseInt(values[0]);
            int finishnumber = 0;

        for(int i=0 ; i<size;i++){

            if(values[i].equals("+")){
                finishnumber = Integer.parseInt(values[i+1]);
                startnumber =startnumber+finishnumber; // 처음 숫자로
                i++;
            }
            else if(values[i].equals("-")){
                finishnumber = Integer.parseInt(values[i+1]);
                startnumber =startnumber-finishnumber; // 처음 숫자로
                i++;
            }
            else if(values[i].equals("/")){
                finishnumber = Integer.parseInt(values[i+1]);
                startnumber =startnumber/finishnumber; // 처음 숫자로
                i++;
            }
            else if(values[i].equals("*")){
                finishnumber = Integer.parseInt(values[i+1]);
                startnumber =startnumber*finishnumber; // 처음 숫자로
                i++;
            }

            }

            System.out.println(startnumber);

    }
}
