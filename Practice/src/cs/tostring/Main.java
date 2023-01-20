package cs.tostring;

public class Main {
    // out은 printString 타입

    // 메소드 이름은 같은데 다양한 타입 받는거 오버로딩
    //

    private static class Car {

        public void run(){
            System.out.println("Run");
        }

        public String toString(){
            return "달리다";
        }
    }

    public static void main(String[] args) {

        Car c1 = new Car();
        System.out.println(c1); //println(Object x) - Object로 참조할 수 있는 것은 무엇이든 받을 수 있다
    }

    // 부모타입의 변수로 자식 인스턴스를 참조 할 수 있다.
    // 조상타입의 변수로 후손 인스턴스를 참조 할 수 있다.
    // Object가 가지고 있는 toString 메소드를 오버라이딩 함으로서 내가 원하는 문자열이 출력되도록 한다.

    // equals() & hashCode()는 언제 오버라이딩을 하는 것인가?


}
