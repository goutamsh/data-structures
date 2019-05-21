package com.gshepur.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {


    @Test(expected = RuntimeException.class)
    public void popException() {
        IStack<Integer> integerStack = new Stack<>(5);
        integerStack.pop();
    }

    @Test(expected = RuntimeException.class)
    public void pushPopException() {
        IStack<Integer> integerStack = new Stack<>(5);
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(2);
        integerStack.push(2);
        integerStack.push(2);
        integerStack.push(2);
        integerStack.push(2);

    }

    @Test
    public void pushPop() {
        IStack<Integer> integerStack = new Stack<>(5);
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        assertEquals(5, integerStack.size());
        assertEquals(Integer.valueOf(5), integerStack.pop());
        assertEquals(Integer.valueOf(4), integerStack.pop());
        assertEquals(Integer.valueOf(3), integerStack.pop());
        assertEquals(Integer.valueOf(2), integerStack.pop());
        assertEquals(Integer.valueOf(1), integerStack.pop());
        assertEquals(0, integerStack.size());
    }

    @Test
    public void pushPopWithStrings() {
        IStack<String> stringStack = new Stack<>(5);
        stringStack.push("a");
        stringStack.push("b");
        stringStack.push("c");
        stringStack.push("d");
        stringStack.push("e");
        assertEquals(5, stringStack.size());
        assertEquals("e", stringStack.pop());
        assertEquals("d", stringStack.pop());
        assertEquals("c", stringStack.pop());
        assertEquals("b", stringStack.pop());
        assertEquals("a", stringStack.pop());
        assertEquals(0, stringStack.size());
    }


}