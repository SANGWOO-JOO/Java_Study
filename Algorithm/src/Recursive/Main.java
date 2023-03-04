package Recursive;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println(n + "의 팩토리얼 값: " + result);
    }

    public static int factorial(int n) {
        if (n == 0) { // 종료 조건
            return 1; // 기점
        } else {
            return n * factorial(n-1); // 재귀 호출
        }
    }
}

