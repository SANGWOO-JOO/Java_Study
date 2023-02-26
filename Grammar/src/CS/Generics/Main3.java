package CS.Generics;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<Product>();
        list.add(new Product("제품",0));
        list.add(new Tv("티비",1)); // 자손 객체 저장


        Product p = list.get(0);
        Tv t =(Tv)list.get(1); //자손객체의 형변환

        System.out.println(p.name +"," +p.idx );
        System.out.println(t.name +"," +t.idx);
    }

    private static class Product {
        String name ="";
        int idx;

        public Product(String name, int idx) {
            this.name = name;
            this.idx = idx;
        }
    }

    private static class Tv extends Product {
        String name ="";
        int idx;

        public Tv(String name, int idx) {
            super(name, idx);
            this.name = name;
            this.idx = idx;
        }
    }
}
