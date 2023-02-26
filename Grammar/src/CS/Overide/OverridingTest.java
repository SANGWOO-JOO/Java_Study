package CS.Overide;

public class OverridingTest {

    public static void main(String[] args) {
        Person person = new Person();
        Child child = new Child();
        Senior senior = new Senior();

        person.cry();
        child.cry();
        senior.cry();
    }
}

class Person {
    void cry() {
        System.out.println("흑흑");
    }
}

class Child extends Person {
    @Override // Child 부모는 Person
    protected void cry() {
        System.out.println("잉잉");
    }
}

class Senior extends Person {
    @Override // Senior 부모는 Person
    public void cry() {
        System.out.println("훌쩍훌쩍");
    }
}