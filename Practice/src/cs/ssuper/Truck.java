package cs.ssuper;
/*
    super 생성자 알아야 되는 이유

    부모가 기본생성자가 아닐 경우 직접 호출해 주어야한다
 */


public class Truck extends Car {
    public Truck(){
//        super("소방차");
        System.out.println("Truck의 기본생성자입니다.");
    }
}
