package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int EMPTY_RHYMER = -1;
    private final int ERROR_VALUE = -1;
    private final int CAPACITY = 12;

    private int[] numbers = new int[CAPACITY];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER;
    }

    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total--];
    }

}
