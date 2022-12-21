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
        System.out.println(linkedList2.searchNode(30));

        LinkedList<Integer> linkedList3=new LinkedList<>();
        System.out.println("\n******** : Insert a node in between : *********");
        linkedList3.append(56);
        linkedList3.append(70);
        System.out.println("********** : Display linked list without insert : *********");
        linkedList3.show(); // Display Node elements
        System.out.println("******** : Display linked list insert a node in between : *******");
        linkedList3.searchAndAdd(56,30);
        linkedList3.show(); // Display Node elements
    }


}
