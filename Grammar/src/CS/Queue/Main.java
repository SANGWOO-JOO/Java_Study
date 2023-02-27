package CS.Queue;

import java.util.ArrayList;

public class Main<T> {
    private ArrayList<T> queue = new ArrayList<T>(); // 내부의 큐 저장 공간 생성

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (queue.isEmpty()) { // 비어있으면 null
            return null;
        }
        return queue.remove(0); // 해당 인덱스 번호를 반환 후 삭제
    }

    public boolean isEmpty() { // null인지 boolean으로 판별
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        Main<Integer> mq = new Main<Integer>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
    }
}
