package com.ankit;

public class NthNode {
    Node head;
    int size;
    public void insertAtfirst(int i){
        Node newnode = new Node(i);
        newnode.next = head;
        head = newnode;
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->" );
            temp = temp.next;
        }
    }
public int node(int idx){
    int m = size-idx+1;
    Node temp = head;
    for(int i =1;i<m;i++){
        temp = temp.next;
    }
    return temp.value;
}

    public class Node{
        int value;
        Node next;
        Node(int val){
            this.value=val;
        }
        Node(int val,Node next){
            this.value = val;
            this.next = next;
        }

    }

    public static void main(String[] args) {
        NthNode l = new NthNode();
        l.insertAtfirst(4);
        l.insertAtfirst(5);
        l.insertAtfirst(6);
        l.display() ;
        System.out.println();
        System.out.println(l.size);
        System.out.println(l.node(2));

    }
}
