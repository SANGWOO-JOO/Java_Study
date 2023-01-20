package cs.Tread;

class Hamburger extends Thread implements Runnable  {

    // 이 클래스에서 상위 클래스인 Thread의 run() 메소드를 재정의를 해야 Thread의 실행부분을 작성할 수 있다.

    @Override
    public void run() {
        super.run(); //Thread 클래스를 상속받아서 만들때 super() 사용
        System.out.println("Hamburger 나왔습니다.");
    }
}

