package cs.synchro;

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {

        Calculator calculator =new Calculator();

        User1Thread user1Thread =new User1Thread();
        user1Thread.setCalculator(calculator);
        user1Thread.start();
        user1Thread.join();
        // user2Thread는 객체가 잠금 해제될 때 까지 실행 x
        User2Thread user2Thread = new User2Thread();
        user2Thread.setCalculator(calculator);
        user2Thread.start();
        user2Thread.join();

        User3Thread user3Thread =new User3Thread();
        user3Thread.setCalculator(calculator);
        user3Thread.start();


    }
}
