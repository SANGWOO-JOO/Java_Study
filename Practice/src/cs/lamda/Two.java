package cs.lamda;

import java.util.ArrayList;
import java.util.List;

public class Two {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("C");
        list.add("React");

        for(String str : list){
            System.out.println(str);
        }

        System.out.println();

        list.stream().forEach((String str) -> System.out.println(str));

        System.out.println();
        // String 생략 가능
        list.stream().forEach( str-> System.out.println(str));
        System.out.println();
        // -> 왼쪽 부분 생략
        list.stream().forEach(System.out::println);



    }
}
