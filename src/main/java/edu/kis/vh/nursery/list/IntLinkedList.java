package edu.kis.vh.nursery.list;

/**
 * The IntLinkedList class represents a linked list of integers.
 * It provides methods to add elements to the list, check if the list is empty or full,
 * retrieve the top element, and remove the top element.
 */
public class IntLinkedList {

    private final int IS_EMPTY_VALUE = -1;

    private Node last;
    private int i;

    /**
     * Adds a new element to the end of the list.
     *
     * @param i the integer value to be added to the list
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Checks if the list is empty.
     *
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Checks if the list is full.
     *
     * @return false as the list can never be full
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Retrieves the value of the top element in the list without removing it.
     *
     * @return the value of the top element, or IS_EMPTY_VALUE if the list is empty
     */
    public int top() {
        if (isEmpty())
            return IS_EMPTY_VALUE;
        return last.getValue();
    }

    /**
     * Retrieves and removes the value of the top element in the list.
     *
     * @return the value of the top element, or IS_EMPTY_VALUE if the list is empty
     */
    public int pop() {
        if (isEmpty())
            return IS_EMPTY_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    private static class Node {

        private final int value;
        private Node prev;
        private Node next;

        /**
         * Constructs a new node with the specified value.
         *
         * @param i the integer value of the node
         */
        public Node(int i) {
            value = i;
        }

        /**
         * Retrieves the previous node.
         *
         * @return the previous node
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Sets the previous node.
         *
         * @param prev the node to be set as the previous node
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * Retrieves the next node.
         *
         * @return the next node
         */
        public Node getNext() {
            return next;
        }

        /**
         * Sets the next node.
         *
         * @param next the node to be set as the next node
         */
        public void setNext(Node next) {
            this.next = next;
        }

        /**
         * Retrieves the value of the node.
         *
         * @return the integer value of the node
         */
        public int getValue() {
            return value;
        }
    }

}
