package com.ankit;

public class LL {
    private Node head;
     static int size;
    public void insertFirst(int val){
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
        size++;
    }
public void insertLast(int i){
        Node newnode1 = new Node(i);
        Node temp1 = head;
        while(temp1.next!=null){
            temp1 = temp1.next;
        }
        temp1.next = newnode1;
        size++;
}
public void insert(int i1,int index){
       if(index==0){
           insertFirst(i1);
       }
       if(index==size){
           insertLast(i1);
       }
       Node temp = head;
       for(int i =1;i<index;i++){
           temp = temp.next;
       }
       Node newnode = new Node(i1,temp.next);
       temp.next = newnode;
       size++;
}
public void display(){
        Node temp = head;
    while(temp!=null){
        System.out.print(temp.value + "->" );
        temp= temp.next;
    }
        System.out.print("End");
}
   private class Node{
        int value;
        Node next;
        private Node(int value){
            this.value = value;
        }
        private Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
    LL list = new LL();
    list.insertFirst(31);
    list.insertFirst(34);
    list.insertLast(4);
    list.insert(7,2);
    list.display();
    System.out.println();
    System.out.println(size);


    }
}
