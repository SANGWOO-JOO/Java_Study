package CS.Generics;

class GenericClass<T>{

    T ob;

    public GenericClass(T ob){
        this.ob =ob;
    }
    void printType(){
        System.out.println(ob.getClass().getName());
    }
}

class GenericClass2<T ,E>{
      T ob;
      E ob2;

    public GenericClass2(T ob, E ob2) {
        this.ob = ob;
        this.ob2 = ob2;
    }

    void print(){
        System.out.println(ob.getClass().getName());
    }
}

  public class Main {
    public static void main(String[] args) {

        GenericClass<Integer> generic =new GenericClass<>(10);
        GenericClass2<Integer, Integer> generic2 =new GenericClass2<>(2,10);
        generic.printType();
        generic2.print();
    }
}
