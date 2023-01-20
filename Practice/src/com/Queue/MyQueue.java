package com.Queue;

import java.util.ArrayList;

public class MyQueue<T> {
    //내부에 큐 공간 만들기
    private ArrayList<T>queue = new ArrayList<T>();

    public void enqueue(T item){
        queue.add(item);
    }

    public  T dequeue(){
        if(queue.isEmpty()){
            return null;
        }
        return queue.remove(0);
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue<Integer>mq =new MyQueue<>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);

        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());

    }
}
