package Stream.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main5 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("짱구", 23, "010-1234-1234"));
        personList.add(new Person("유리", 24, "010-2341-2341"));
        personList.add(new Person("철수", 29, "010-3412-3412"));
        personList.add(new Person("맹구", 25, null));

// Function.identity는 t -> t, 항상 입력된 인자(자신)를 반환합니다.
        Map<String, Person> personMap = personList.stream()
                .collect(Collectors.toMap(Person::getName, Function.identity()));
    }
}
class Person {
    private String name;
    private int age;
    private String phoneNumber;

    public Person(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}