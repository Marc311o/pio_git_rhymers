package edu.kis.vh.nursery.list;

import org.junit.Test;

import static org.junit.Assert.*;
public class IntLinkedListUnitTest {

    @Test
    public void testPush() {
        IntLinkedList list = new IntLinkedList();
        list.push(5);
        assertEquals(5, list.top());
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();
        assertTrue(list.isEmpty());
        list.push(5);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testIsFull() {
        IntLinkedList list = new IntLinkedList();
        assertFalse(list.isFull());
    }

    @Test
    public void testTop() {
        IntLinkedList list = new IntLinkedList();
        final int EMPTY_STACK_VALUE = -1;
        assertEquals(EMPTY_STACK_VALUE, list.top());
        list.push(5);
        assertEquals(5, list.top());
    }

    @Test
    public void testPop() {
        IntLinkedList list = new IntLinkedList();
        final int EMPTY_STACK_VALUE = -1;
        assertEquals(EMPTY_STACK_VALUE, list.pop());
        list.push(5);
        assertEquals(5, list.pop());
        assertEquals(EMPTY_STACK_VALUE, list.pop());
    }
}