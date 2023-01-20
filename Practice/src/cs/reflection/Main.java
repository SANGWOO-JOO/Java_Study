package cs.reflection;

class apple{

}

public class Main {
    public static void main(String[] args) {
        Class cla1 = apple.class;
//        Class cla2 = Class.forName("reflection.apple");
        Class cla3 = cla1.getClass();

        System.out.println(cla1);
        System.out.println(cla3);

    }
}
