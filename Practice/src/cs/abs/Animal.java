package cs.abs;


class Cat extends Animal {
    void Cry() {
        System.out.println("Mio");
    }
}

class Dog extends Animal {
    void Cry() {
        System.out.println("Sio");
    }
}


public abstract class Animal {

    abstract void Cry();

}
