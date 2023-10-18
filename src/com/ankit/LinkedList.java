package com.ankit;

public class LinkedList {
     private Node head;
     int size;
public void insertAtfirst(int value){
    Node newnode1 = new Node(value);
    newnode1.next=head;
    head = newnode1;
}
    public void insertAtend(int i){
        Node newnode = new Node(i);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newnode;
    }
    public void insert(int i1, int idx){
    Node new1 = new Node(i1);
    if(idx==0){
        insertAtfirst(i1);
        return;
    }
        if(idx==size1()){
            insertAtend(i1);
            return;
        }
        Node temp1 = head;

    for(int i =1;i<idx;i++){
        temp1 = temp1.next;
    }
    new1.next = temp1.next;
    temp1.next = new1;

    }
    public int getAt(int value,int idx1){
    Node temp2 = head;
    for(int i =1;i<=idx1;i++){
      temp2 = temp2.next;
    }
    return temp2.value;
    }
public Node deleteAt(int index){
    if(index == 0){
        return head.next;
    }
    Node temp = head;
    for(int i =1;i<index;i++){
        temp = temp.next;
    }
    temp.next = temp.next.next;
    return temp;
}
public void middle(){
    Node slow = head;
    Node fast = head;
    while(fast.next!=null && fast.next.next!=null){
        slow = slow.next;
        fast = fast.next.next;
    }
}
    public int size1() {
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
public void insertrec(int value, int index){

    head = insertrec(value,index,head);
}
private Node insertrec(int value, int index, Node node){
    if(index==0){
        Node temp = new Node(value,node);
        size++;
        return temp;
    }
    node.next= insertrec(value, index -1,node.next);
    return node;
}
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "->" );
            temp = temp.next;
        }
    }

    private class Node {
         int value;
         Node next ;

        private Node(int value) {

            this.value = value;
         }
         private Node(int value, Node next){
            this.value = value;
            this.next = next;
         }

     }


    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.insertAtfirst(3);
        li.insertAtend(4);
        li.insertAtend(5);
        li.insertAtend(6);
        li.display();
//        li.insert(4,1);
//        li.insert(5,2);
//      li.insert(5,0);
//        li.insert(7, li.size1());
//        li.display();
       System.out.println();
       li.deleteAt(1);
        li.display();
        li.insert(1,1);
        System.out.println();
        li.display();
        li.insertrec(88,2);
        System.out.println();
        li.display();
    }
}
