package com.codecool.stack.stack;


import com.codecool.stack.exception.StackOverflow;
import com.codecool.stack.exception.StackUnderFlow;

public class Stack {

    private int length;
    private int[] stack;
    private int counter = 0;

    public Stack(int length) {
        this.length = length;
        this.stack = new int [this.length];
    }

    public void pushToStack(int pushedElement) {
            try {
                if(this.counter < this.length) {
                    this.stack[counter] = pushedElement;
                    this.counter += 1;
                } else {
                    throw new StackOverflow("The stack is full.");
                }

            } catch (StackOverflow stackOverflow) {
                System.out.println(stackOverflow.getMessage());
            }
        }

    public Integer popFromStack() {
        try {
            if(this.counter == 0) {
                throw new StackUnderFlow("The stack is empty");
            } else {
                int lastElement = this.stack[counter-1];
                this.stack[counter-1] = 0;
                counter -= 1;
                return lastElement;
            }
        } catch (StackUnderFlow stackUnderFlow) {
            System.out.println(stackUnderFlow.getMessage());
            return null;
        }
    }

    public Integer peekFromStack() {
        try {
            if(counter != 0) {
                int lastElement = this.stack[counter-1];
                System.out.println("The last element is: " + lastElement);
                return lastElement;
            } else {
                throw new StackUnderFlow("There is no element in the stack to return");
            }
        } catch (StackUnderFlow stackUnderFlow) {
            System.out.println(stackUnderFlow.getMessage());
            return null;
        }
    }

    public int sizeOfStack() {
        return this.counter;
    }

    public void printStack() {
        System.out.println("The elements in stack: \n");
        for (int element: this.stack
             ) {
            System.out.println(element);
        }
    }
}
