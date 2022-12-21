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

        LinkedList<Integer> linkedList3 = new LinkedList<>();
        System.out.println("\n******** : Insert a node in between : *********");
        linkedList3.append(56);
        linkedList3.append(70);
        System.out.println("********** : Display linked list without insert : *********");
        linkedList3.show(); // Display Node elements
        System.out.println("******** : Display linked list insert a node in between : *******");
        linkedList3.searchAndAdd(56, 30);
        linkedList3.show(); // Display Node elements


        LinkedList<Integer> linkedList4 = new LinkedList<>();
        System.out.println("\n********* : Delete a Node from head using pop method : **********");
        linkedList4.push(70);
        linkedList4.push(30);
        linkedList4.push(56); // Head Node Delete
        System.out.println("********** : Display linked list without delete : *********");
        linkedList4.show();  // Display Node Elements
        System.out.println("********** : Display linked list after delete the element : *********");
        linkedList4.deleteFirstNode(); // Delete a head node
        linkedList4.show(); // Display Node Elements


        LinkedList<Integer> linkedList5 = new LinkedList<>();
        System.out.println("\n********* : Delete a Node from tail using popLast method : **********");
        linkedList5.push(70); // Tail Node Delete
        linkedList5.push(30);
        linkedList5.push(56);
        System.out.println("********** : Display linked list without delete : *********");
        linkedList5.show();  // Display Node Elements
        System.out.println("********** : Display linked list after delete the element : *********");
        linkedList5.deleteLastNode();
        linkedList5.show(); // Display Node Elements

        LinkedList<Integer> linkedList6 = new LinkedList<>();
        System.out.println("\n********* : Display the Linked List Elements for Search operation : **********");
        linkedList6.push(70);
        linkedList6.push(30); // Search a node
        linkedList6.push(56);
        linkedList6.show();  // Display Node Elements
        if (linkedList6.searchNode(30) == null)
            System.out.println("Searched element not found!!!");
        else System.out.println("Searched element found! in the Linked List");

        LinkedList<Integer> linkList7=new LinkedList<>();
        System.out.println("\n******** : Insert a node After the element in between : *********");
        linkList7.append(56);
        linkList7.append(30); // Insert Node after 30 Node
        linkList7.append(70);
        System.out.println("********** : Display linked list without insert After Node : *********");
        linkList7.show(); // Display Node elements
        System.out.println("******** : Display linked list insert After a node in between : *******");
        linkList7.searchAndAdd(30,40);
        linkList7.show(); // Display Node elements

        LinkedList<Integer> linkedList8=new LinkedList<>();
        System.out.println("\n********* : Delete a Node in-between the linked List : **********");
        linkedList8.push(70);
        linkedList8.push(40); // Pop
        linkedList8.push(30);
        linkedList8.push(56);
        System.out.println("********** : Display linked list without delete : *********");
        linkedList8.show();  // Display Linked List
        System.out.println("********** : Display linked list after delete the element : *********");
        linkedList8.searchAndDelete(40);
        linkedList8.show(); // Display Node Elements

    }
}

