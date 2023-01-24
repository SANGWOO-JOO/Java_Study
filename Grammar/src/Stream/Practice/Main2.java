package Stream.Practice;
@FunctionalInterface
interface MyFunction{
    void run();
}

class Ex{
    static void execute(MyFunction f){
        f.run();
    }

    static MyFunction getMyFunction(){
        MyFunction f =() -> System.out.println("f3.fun()");
        return f;
    }
}


public class Main2 {
    public static void main(String[] args) {
        MyFunction f1 = () -> System.out.println("f1.fun()");

        MyFunction f2 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("f2.fun()");
            }
        };

        MyFunction f3 = Ex.getMyFunction();

        System.out.println("Test");
        f1.run();
        f2.run();
        f3.run();

    }
}
