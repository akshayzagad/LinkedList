package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void push(T key) {
        Node<T> newNode = new Node<>(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void show() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.key + "=>");
            temp = temp.next;
        }
        System.out.println();
    }

    public void append(T key) {
        Node<T> newNode = new Node<>(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node<T> searchNode(T key) {
        if (head == null) {
            System.out.println("linkList is null");
        } else {
            Node<T> currentNode = head;
            while (currentNode != null) {
                if (currentNode.key.equals(key)) {
                    return currentNode;
                }
                currentNode = currentNode.next;
            }
        }
        return null;
    }


    public void searchAndAdd(T searchKey, T addKey) {
        Node<T> searchNode = searchNode(searchKey);//30
        Node<T> temp = searchNode.next;
        Node<T> newNode = new Node<>(addKey);//40
        if (searchNode != null) {
            searchNode.next = newNode;//30=>40
            newNode.next = temp;//40=?70
        }
    }
}
