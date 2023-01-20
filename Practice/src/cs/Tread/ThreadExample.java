package cs.Tread;

public class ThreadExample{

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger(); // Thread 객체를 생성한 후
        hamburger.start();                     // start() 메소드를 호출하면 thread가 실행된다. 여기서 start() 메소드는 쓰레드 객체의 run() 메소드를 호출한다.
    }
}