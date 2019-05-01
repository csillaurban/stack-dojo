package com.codecool.stack;

import com.codecool.stack.stack.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(4);

        stack.pushToStack(3);
        stack.pushToStack(2);
        stack.pushToStack(5);
        stack.pushToStack(7);
        stack.printStack();
        stack.pushToStack(12);
        stack.popFromStack();
        stack.popFromStack();
        stack.printStack();
        stack.peekFromStack();
    }
}
