package com.gshepur.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test(expected = RuntimeException.class)
    public void dequeException() {
        IQueue<Integer> queue = new Queue<>(5);
        queue.dequeue();
    }

    @Test(expected = RuntimeException.class)
    public void enqueuException() {
        IQueue<Integer> queue = new Queue<>(5);
        queue.enque(1);
        queue.enque(1);
        queue.enque(1);
        queue.enque(1);
        queue.enque(1);
        System.out.println(queue.toString());
        queue.enque(1);
    }

    @Test
    public void enqueDequeue() {

        IQueue<Integer> queue = new Queue<>(5);

        queue.enque(1);

        assertEquals(1, queue.size());
        assertEquals(Integer.valueOf(1), queue.dequeue());


        assertEquals(0, queue.size());

        queue.enque(1);
        queue.enque(2);
        queue.enque(3);

        assertEquals(3, queue.size());
        assertEquals(Integer.valueOf(1), queue.dequeue());
        assertEquals(Integer.valueOf(2), queue.dequeue());
        assertEquals(Integer.valueOf(3), queue.dequeue());
        assertEquals(0, queue.size());

        queue.enque(1);
        queue.enque(2);
        queue.enque(3);
        queue.enque(4);
        assertEquals(Integer.valueOf(1), queue.dequeue());
        assertEquals(3, queue.size());

        assertEquals(Integer.valueOf(2), queue.dequeue());
        assertEquals(Integer.valueOf(3), queue.dequeue());

        assertEquals(1, queue.size());
        queue.enque(5);
        queue.enque(6);
        queue.enque(7);
        assertEquals(4, queue.size());

        queue.enque(8);
        assertEquals(5, queue.size());
        System.out.println(queue.toString());

        assertEquals(Integer.valueOf(4), queue.dequeue());
        assertEquals(Integer.valueOf(5), queue.dequeue());
        assertEquals(Integer.valueOf(6), queue.dequeue());

        assertEquals(2, queue.size());

        assertEquals(Integer.valueOf(7), queue.dequeue());
        assertEquals(Integer.valueOf(8), queue.dequeue());
        System.out.println(queue.toString());
        assertEquals(0, queue.size());


    }

    @Test
    public void enqueDequeueString() {

        IQueue<String> queue = new Queue<>(5);

        queue.enque("a");

        assertEquals(1, queue.size());
        assertEquals("a", queue.dequeue());


        assertEquals(0, queue.size());

        queue.enque("a");
        queue.enque("b");
        queue.enque("c");

        assertEquals(3, queue.size());
    }

}