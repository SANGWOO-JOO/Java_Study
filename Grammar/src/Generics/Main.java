package Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add("30");

        Integer i = (Integer) list.get(1);
        String s = (String) list.get(2);

        System.out.println(i);
        System.out.println(s);
        System.out.println(list);


    }
}
