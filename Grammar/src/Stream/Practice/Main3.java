package Stream.Practice;

import java.util.Optional;

public class Main3 {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable("자바 Optional 객체");



        if(opt.isPresent()) {

            System.out.println(opt.get());

        }
    }
}
