package cs.polymorphism;

class Tv{
    boolean power;
    int channel;

    void power(){ power = !power;}
    void channelUp(){++channel;}
    void chaneelDown(){--channel;}
}

class SmartTv extends Tv{
    String text;
    void caption(){}
}

public class Main {


}
