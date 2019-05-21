package com.gshepur.queue;


import java.util.Arrays;

public class Queue<T> implements IQueue<T> {

    private Object[] values;

    private int front;

    private int rear;

    private int capacity;

    public Queue(int capacity){
        this.capacity = capacity;
        front = -1;
        rear = -1;
        values = new Object[this.capacity];
    }
    @Override
    public void enque(T t) {
        //check if queue if full
        if((rear + 1) % capacity == front){
            throw new RuntimeException("Queue is Full");
        }
        if(front == rear && front == -1){
            front = 0;
            rear = 0;
            values[rear] = t;
            return;
        }
        rear = (rear + 1) % capacity;
        values[rear] = t;
    }

    @Override
    public T dequeue() {
        if(front == rear && rear == -1){
            throw new RuntimeException("Queue is Empty");
        }
        T value = (T) values[front];
        if(front == rear){
            front = -1;
            rear = -1;
        }else{
            front = (front + 1) % capacity;
        }
        return value;
    }

    @Override
    public int size() {
        if(front == rear && front == -1){
            return 0;
        }
        if(front <= rear){
            return rear - front +1;
        }else {
            return (capacity - front + rear + 1);
        }
    }

    /**
     * printing just to check if implementation is correct
     * @return
     */
    @Override
    public String toString() {
        return "Queue : [front:"+front+", rear:"+rear+", value:"+Arrays.asList(values)+"]";
    }
}
