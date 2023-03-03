package CS.Object;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        System.out.println(person1.equals(person2)); // false
        System.out.println(person1.equals(new Person("Alice", 25))); // true

    }
}