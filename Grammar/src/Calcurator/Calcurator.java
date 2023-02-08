package Calcurator;

import java.util.ArrayList;
import java.util.Scanner;

public class Calcurator {
    int result = 0;

    int minus(int operator1, int operator2){
        return result=operator1-operator2;
    }
    int plus(int operator1, int operator2){
        return result=operator1+operator2;
    }
    int multiply(int operator1, int operator2){
        return  result=operator1*operator2;
    }
    int divide(int operator1, int operator2){
        return result=operator1/operator2;
    }

    int calcurator(int operator1 , String oper, int operator2){

        switch (oper) {
            case "+":
                plus(operator1, operator2);
            case "-":
                minus(operator1, operator2);
            case "*":
                multiply(operator1, operator2);
            case "/":
                divide(operator1, operator2);
            default:
                throw new IllegalArgumentException();
        }
    }
}
