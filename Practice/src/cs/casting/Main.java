package cs.casting;

//class Person{
//    String name;
//    Person(String name){
//        this.name = name;
//    }
//
//    void say(){
//        System.out.println("2");
//    }
//}
//
//class Student extends Person{
//    String check;
//    Student(String name){
//        super(name);
//    }
//
//    void say(){
//        System.out.println("1");
//    }
//}
//
//public class Main{
//    public static void main(String[] args){
//        Student s = new Student("홍길동");
//        Person p = s;	// 업캐스팅
//        p.name = "이름이다.";
////        p.check = "컴파일 에러 발생";	// 컴파일 에러 발생
//        p.say();
//    }
//}

// Down casting
class Person{
    String name;
    Person(String name){
        this.name = name;
    }
}

class Student extends Person{
    String check;
    Student(String name){
        super(name);
    }
}

public class Main{
    public static void main(String[] args){
        Person p = new Student("홍길동");

        System.out.println(p.getClass().getName());

        System.out.println();

        Student s = (Student)p;	// 다운캐스팅
        s.name = "김유신";
        s.check = "check!";


    }
}