package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    public void push(T key) {
        Node<T> newNode=new Node<>(key);
        if (head==null){
            head=newNode;
            tail=newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
        }
    }

    public void show() {
        Node<T> temp=head;
        while (temp!=null){
            System.out.print(temp.key+"=>");
            temp=temp.next;
        }
        System.out.println();
    }

    public void append(T key) {
        Node<T> newNode=new Node<>(key);
        if (head==null){
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }
    }

    public Node<T> searchNode(T key){
        Node<T> temp=head;
        while (temp!=null){
            if (temp.key==key){
                return temp;
            }else {
                temp=temp.next;
            }
        }
        return null;
    }

}
