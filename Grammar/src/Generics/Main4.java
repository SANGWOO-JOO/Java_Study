package Generics;

import java.util.ArrayList;

public class Main4 {

    public static void main(String[] args) {
        ArrayList<Tv> list = new ArrayList<Tv>(); //참조변수 지네릭 타입과 지정돈 지네릭 타입은 일치해야 함

        ArrayList<? extends Product> Plist = new ArrayList<Tv>();

    }

    private static class Tv extends Product{
        String name ="";
        int idx;

        public Tv(String name, int idx) {
            this.name = name;
            this.idx = idx;
        }
    }

    private static class Product {
    }
}
