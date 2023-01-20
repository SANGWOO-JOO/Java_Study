package cs.reflection;

public class GetClassExample {
    public static void main(String[] args) {
        Class cla = Car.class;

        System.out.println(cla.getPackage().getName()); // 패키지
        System.out.println(cla.getSimpleName()); // 클래스 간단 이름
        System.out.println(cla.getName()); // 클래스 전체 이름

    }

    class Car {

    }
}
