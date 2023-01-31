package Stream.Practice;

public class Main5 {
    public static void main(String[] args) {
        // 기존의 익명함수
        System.out.println(new MyLambdaFunction() {
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        }.max(3, 5));

    }
}
