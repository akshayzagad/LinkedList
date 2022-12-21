package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome To My LinkedList");
        LinkedList<Integer> linkList1 = new LinkedList<>();
        linkList1.push(70);
        linkList1.push(30);
        linkList1.push(56);
        linkList1.show();

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);
        linkedList2.show();
    }


}
