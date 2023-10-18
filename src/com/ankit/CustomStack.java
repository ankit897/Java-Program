package com.ankit;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }
    int ptr = -1;
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("stack is empty");
        }
        int reduced = data[ptr];
        ptr--;
        return reduced;
    }
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is empty");
        }
        int value = data[ptr];
        return value;
    }
    public boolean isFull(){
        return ptr== data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
}
