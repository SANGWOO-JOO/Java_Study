package cs.hashcode;

class Person{
    String name;
    Person(String name){
        this.name =name;
    }
    public boolean equals(Object obj){
        return this.name.equals(((Person)obj).name);
    }
}

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Lee");
        Person p2 = new Person("Lee");

        String str1 = new String("hello");
        System.out.println(str1.hashCode());            // 99162322

        String str2 = new String("hello");
        System.out.println(str2.hashCode());            // 99162322

        // p1 , p2의 객체 참조 변수 출력
        System.out.println("p1 toString()= " + p1); //Person@1554909b
        System.out.println("p2 toString()= " + p2);//Person@1554909b


        // hashcode의 값을 출력
        // p1,p2는 힙 메모리의 서로 다른 객체이므로 해시코드가 다르다.
        System.out.println("p1 hashcode()= " + p1.hashCode()); //1811044090
        System.out.println("p2 hashcode()= " + p2.hashCode()); //114132791

        System.out.println(p1 == p2);       // false
        System.out.println(p1.equals(p2));  // true

    }
}
