package Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;


class Tv{

}
class Audio{

}
public class Main2 {
    public static void main(String[] args) {

        ArrayList<Tv> list = new ArrayList<Tv>(); // Tv 타입의 객체만 저장이 가능하다.
        list.add(new Tv());

        Tv t = list.get(0);
        System.out.println(t);
    }

}
