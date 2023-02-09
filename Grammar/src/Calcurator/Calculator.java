package Calcurator;

public class Calculator {

    int result = 0;

    public int minus(int operator1, int operator2){
        return operator1-operator2;
    }

    public int plus(int operator1, int operator2){
        return operator1+operator2;
    }

    public int multiply(int operator1, int operator2){
        return  operator1*operator2;
    }

    public int divide(int operator1, int operator2){
        return operator1/operator2;
    }

    public int calcurator(int operator1 , char oper, int operator2){

        switch (oper) {
            case '+':
                return plus (operator1, operator2);
            case '-':
                return minus (operator1, operator2);
            case '*':
                return  multiply (operator1, operator2);
            case '/':
                return divide (operator1, operator2);
            default:
                return 0;
        }
    }

    // 공백 단위로 나누기
//     public String[] seperate(String str){
//        String[] seperateString = str.split(" "); // 공백으로 나누기
//         int length = seperateString.length;
//         return seperateString;
//    }

    //문자를 숫자로 바꾸기
    public int toInt(String[] str){
        return Integer.parseInt(String.valueOf(str));
    }

    public int calculateString(String str){ // String 배열이 들어온다.

        String[] seperateString = str.split(" "); //공백 단위로 나누기
        int length = seperateString.length; // split한 문자의 길이

        int firstnum = 0, lastnum =0;

        for (int i=0; i<length -1;i+=2){

            // String str = "2 + 3 * 4 / 2";
            if(i==0){
                firstnum = Integer.parseInt(seperateString[i]);
            }

            lastnum  = Integer.parseInt(seperateString[i+2]);

            System.out.println("앞의 숫자 " + firstnum);
            System.out.println("뒤의 숫자 " +lastnum);
            System.out.println("반복 횟수 : " + i);
            System.out.println("사칙연산 : " + seperateString[i+1].charAt(0));

            firstnum = calcurator(firstnum , seperateString[i+1].charAt(0),lastnum);
            System.out.println("두개를 더한 값 : " + firstnum );
            System.out.println(" -------  ");
        }
        return firstnum;
    }

}

