package cs.finall;

public class finallyy {

    public static void main(String[] args) {
        try {
            int a = 10 /0;
        }catch (Exception e){
            System.out.println("catch and ");
        }finally {
            System.out.println("try latter finally");
        }
    }
}
