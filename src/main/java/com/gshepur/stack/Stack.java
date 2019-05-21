package com.gshepur.stack;

public class Stack<T> implements IStack<T> {

    private Object[] values;

    private int top;

    private int capacity;

    public Stack(int capacity){
        this.capacity = capacity;
        this.top = -1;
        this.values= new Object[this.capacity];

    }


    @Override
    public void push(T t) {
        if(size() == capacity){
            throw new RuntimeException("Stack overflow exception");
        }
        values[++top] = t;
    }

    @Override
    public T pop() {
        if(top == -1){
            throw new RuntimeException("Stack underflow exception");
        }
        return (T)values[top--];
    }

    @Override
    public int size() {
        return top+1;
    }
}
