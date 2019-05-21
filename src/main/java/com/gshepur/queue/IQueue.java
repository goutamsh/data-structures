package com.gshepur.queue;

/**
 * Queue Interface
 *
 * @author Goutam
 */
public interface IQueue<T> {

    /**
     * Enque an element into queue
     * @param t
     */
    void enque(T t);

    /**
     * Dequeu an element from queue
     * @param t
     */
    T dequeue();

    /**
     * Find size
     * @return
     */
    int size();

}
