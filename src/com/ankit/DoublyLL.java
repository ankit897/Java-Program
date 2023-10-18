package com.ankit;

public class DoublyLL {
    Node head;
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }
    public void display(){
        Node temp = head;
        Node last = null;
        while(temp!=null){
            System.out.print(temp.val+"->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("End");
        while(last!=null){
            System.out.print(last.val+"->");
            last = last.prev;
        }
    }
    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.val==value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void insertAfter(int after, int value){
        Node p = find(after);
        if(p==null){
            System.out.print("does not exists");
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next!=null){
            node.next.prev = node;
        }
    }
    public void insertAtend(int value){
        Node node= new Node(value);
        Node temp = head;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }
    private class Node{
        int val;
        Node next;
        Node prev;
         public Node(int val){
            this.val = val;
        }
         public Node(int value, Node next, Node prev){
            this.val = val;
            this.next=next;
            this.prev=prev;
        }
    }

    public static void main(String[] args) {
        DoublyLL ll1 = new DoublyLL();
        ll1.insertFirst(2);
        ll1.insertFirst(3);
        ll1.insertFirst(4);
        ll1.display();
        ll1.insertAtend(3);
        ll1.insertAtend(4);
        ll1.insertAtend(7);
        ll1.display();
        ll1.insertAfter(7,5);
        ll1.display();

    }
}
