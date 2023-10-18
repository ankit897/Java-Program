package com.ankit;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new DynamicStack();
        stack.push(2);
        stack.push(5);
        stack.push(8);
        stack.push(5);
        stack.push(7);
        stack.push(5);
        System.out.println(stack.pop());
    }
}
