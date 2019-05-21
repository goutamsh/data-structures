package com.gshepur.stack;

/**
 * Stack Interface
 *
 * @author Goutam
 */
public interface IStack<T> {

    /**
     * Push an element to Stack
     * @param t
     */
    void push(T t);

    /**
     * Pop an elemen from stack
     * @return
     */
    T pop();

    /**
     * Get size of Stack
     * @return
     */
    int size();
}
