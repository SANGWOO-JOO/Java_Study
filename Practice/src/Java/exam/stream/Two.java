package Java.exam.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Two {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 10),
                new Student("이순신", 20),
                new Student("임꺽정", 30)
        );

        Stream<Student> stream = studentList.stream();
        stream.forEach(s -> System.out.println("이름 : "+ s.getName()));
    }

}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() { return name; }
    public int getScore() { return score; }
}
