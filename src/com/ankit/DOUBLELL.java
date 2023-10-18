package com.ankit;

public class DOUBLELL {
      static Node head;
      public void insertAtindex(int index, int val){
          Node a = new Node(val);
          Node temp = head;
          for(int i = 1;i<index;i++){
              temp = temp.next;
          }
          a.next = temp.next;
          temp.next.prev = a;
          temp.next = a;
          a.prev = temp;
      }
      public void insertAtend(int i){
          Node temp = head;
          Node a = new Node(i);
          while(temp.next!=null){
              temp = temp.next;
          }
          temp.next = a;
          a.prev = temp;
      }
      public void deleteAthead(){
              head = head.next;
              head.prev = null;
      }
 public void insertAthead(int i){
    Node a = new Node(i);
    a.next = head;
    a.prev = null;
    if(head!=null){
        head.prev = a;
    }
    head = a;
    }
    public  void display(){
     Node temp = head;
     while(temp!=null){
         System.out.print(temp.val+"->");
         temp = temp.next;
     }
    }
    private static class Node{
        int val;

        Node prev;
        Node next;
         public  Node(int val){
         this.val = val;
        }
       public  Node(int val, Node next, Node prev){
        this.val = val;
        this.next = next;
        this.prev = prev;
        }
    }

    public static void main(String[] args) {
        DOUBLELL dll = new DOUBLELL();
        dll.insertAthead(7);
        dll.insertAthead(8);
        dll.display();
        System.out.println();
        dll.deleteAthead();
        dll.display();
    }
}
