package Generics;

import java.util.ArrayList;

  class GenericClass<T>{

    T ob;

    public GenericClass(T ob){
        this.ob =ob;
    }
    void printType(){
        System.out.println(ob.getClass().getName());
    }
}

  public class Main {
    public static void main(String[] args) {

        GenericClass<Integer> generic =new GenericClass<>(10);
        generic.printType();
    }
}
