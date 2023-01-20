package cs.object;

class Student{
    String name;
    Student(String name){
        this.name =name;
    }

    public boolean equals(Object obj){ // Object obj = s2 . 다형성 업 캐스팅
        Student s =(Student) obj; // 명시적 형변환

        return this.name == s.name;
    }
}
public class one {

    public static void main(String[] args) {
        Student s1 = new Student("ali");
        Student s2 = new Student("ali");

        System.out.println(s1 == s2); // 두개가 다른 데이터
        System.out.println(s1.equals(s2)); // 두개가 동등한 데이터
    }
}
