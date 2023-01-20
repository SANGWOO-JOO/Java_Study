package cs.Tread;

public class MultiThreadExample{

    public static void main(String[] args) {
        // Runnable 인터페이스를 구현해 Thread를 만들 경우
        // 객체 생성을 Thread 클래스 타입으로 만들어 줘야 한다.
        // run() 메소드의 트리거 역할을 하는 start()는 Thread 클래스에 정의되어있기 때문에 반드시 객체 생성시 Thread 타입으로 만들어야 한다.
        Thread hamburger = new Thread(new Hamburger());
        hamburger.start();
    }
}