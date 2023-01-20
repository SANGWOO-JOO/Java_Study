package cs.synchro;

public class Calculator {

    private int memory;

    public int getMemory(){
        return memory;
    }

    public synchronized void setMemory1(int memory){
        this.memory =memory; // 메모리값 저장

        try{
            Thread.sleep(2000); // 2초간 일시정지
        }catch (InterruptedException e){

        }
            System.out.println(Thread.currentThread().getName() + " :"+this.memory); // this.memory 메모리값 읽기
        }


    public synchronized void setMemory2(int memory){
        synchronized(this){
            this.memory =memory;
            try{
                Thread.sleep(2000); // 2초간 일시정지
            }catch (InterruptedException e){

            }
                System.out.println(Thread.currentThread().getName() + " :"+this.memory); // this.memory 메모리값 읽기
            }
        }


    }


