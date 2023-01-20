package cs.synchro;

public class User3Thread extends Thread{
    private Calculator calculator;

    public User3Thread(){
        setName("User3Thread");
    }

    public void setCalculator(Calculator calculator){
        this.calculator =calculator;
    }

    @Override
    public void run(){
        calculator.setMemory1(30);
    }
}
