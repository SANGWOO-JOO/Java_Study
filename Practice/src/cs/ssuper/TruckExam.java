package cs.ssuper;


/*
   new라는 연산자로 트럭을 생성할 때 메모리에 올라갈때(인스턴스 생성될때 ) 부모인 car 객체가 먼저 생성되야지 truck도 생성이 된다.
   생성자 하는일: 객체를 초기화하는일
   생성자가 호출될때 자동으로 부모의 호출ㄷ자 생성자 호출 => 객체 생성
   부모 생성자 super() 부모의 생성자가 호출된다.
   자동으로 컴파일러는 super() 부모의 기본 생성자를 호출함

   나를 가르키는 키워드 this 부모를 가르키는 키워드는 super



 */

public class TruckExam {

    public static void main(String[] args) {
        Truck t =new Truck(); // Truck 생성

        System.out.println("-----");
        Car c =new Car("경찰차"); // Car 생성

    }
}
