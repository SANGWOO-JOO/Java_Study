package CS.Object;

public class Person {
    private String name; //name과 age는 인스턴스 변수
    private int age;

    public Person(String name, int age) {
    }


    // constructor, getter, setter

    @Override
    public boolean equals(Object obj) { // Person 클래스의 인스턴스 변수인 name과 age를 비교하여 동일하다면 true를 반환하고, 그렇지 않은 경우에는 false를 반환
        if (obj == this) { // 자기 자신과의 비교
            return true;
        }

        if (!(obj instanceof Person)) { // 클래스 타입이 다를 때 비교
            return false;
        }

        Person person = (Person) obj; // obj 객체를 Person 타입으로 캐스팅하여 비교
        return person.name.equals(name) && person.age == age;
    }
}