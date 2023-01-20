package cs.StaticTest;

public class StaticTest {

    static int sta =10;  // static 변수
    int nonsta=15; // nonstatic 변수

    public static void main(String[] args) {

        StaticTest staticTest1 = new StaticTest();
        StaticTest staticTest2 = new StaticTest();

        System.out.println(" static " + staticTest1.sta + " and non-static " + staticTest1.nonsta);
        System.out.println(" static " + staticTest2.sta + " and non-static " + staticTest2.nonsta);

        staticTest1.sta =12;
        staticTest2.nonsta=17; //객체 생성
        staticTest1.nonsta=18;

        System.out.println("------");
        System.out.println(" static " + staticTest1.sta + " and non-static " + staticTest1.nonsta);
        System.out.println(" static " + staticTest2.sta + " and non-static " + staticTest2.nonsta);
    }
}
