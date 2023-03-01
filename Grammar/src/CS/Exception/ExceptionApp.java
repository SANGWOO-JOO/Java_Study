package CS.Exception;

public class ExceptionApp {
    public static void main(String[] args) {
        System.out.println(1);

        int [] scores = {1,2,3};

//        System.out.println(scores[3]);  // 예외 발생
//        try {
//            System.out.println(scores[3]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("False");
//        }
//
//
//        /**
//         * 예외적 상황 발생
//         * System.out.println(2/0); //Exception in thread "main" java.lang.ArithmeticException:
//         */
//        try {
//            System.out.println(2/0);
//        }catch (ArithmeticException e){
//            System.out.println("False");
//        }
//        System.out.println(3);

        try {
            System.out.println(2);
            System.out.println(scores[3]);
            System.out.println(3);
            System.out.println(2/0);
            System.out.println(4);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("False"); // 1
        }catch (ArithmeticException e){
            System.out.println("False");
        }
        System.out.println(5);

    }
}
