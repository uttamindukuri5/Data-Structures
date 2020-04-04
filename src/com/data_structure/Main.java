package com.data_structure;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int data1 = 5;
        int data2 = 3;
        int data3 = 4;
        int data4 = 6;
        int index = 2;

        SingleLinkedList singleList = new SingleLinkedList();
        DoubleLinkedList doubleList = new DoubleLinkedList();
        CircularLinkedList circleList = new CircularLinkedList();
        BinarySearchTree bst = new BinarySearchTree();
        AVL avl = new AVL();

        System.out.println("###############################");
        System.out.println("#      Single Linked List     #");
        System.out.println("###############################");

        singleList.insertHead(data1);
        singleList.insertHead(data2);
        singleList.insertTail(data3);
        singleList.insert(index, data4);
        System.out.println("Size of Linked List: " + singleList.size());
        singleList.display();
        singleList.remove(data1);
        System.out.println("Size of Linked List: " + singleList.size());
        singleList.display();
        System.out.println(data1 + " is in position " + singleList.index(data1));
        System.out.println("Head: " + singleList.getHead());
        System.out.println("Tail: " + singleList.getTail());

        System.out.println("###############################");
        System.out.println("#      Double Linked List     #");
        System.out.println("###############################");

        doubleList.insertHead(data1);
        doubleList.insertHead(data2);
        doubleList.insertTail(data3);
        doubleList.insert(index, data4);
        System.out.println("Size of Linked List: " + doubleList.size());
        doubleList.display();
        doubleList.remove(data1);
        System.out.println("Size of Linked List: " + doubleList.size());
        doubleList.display();
        System.out.println(data1 + " is in position " + doubleList.index(data1));
        System.out.println("Head: " + doubleList.getHead());
        System.out.println("Tail: " + doubleList.getTail());

        System.out.println("###############################");
        System.out.println("#    Circular Linked List     #");
        System.out.println("###############################");

        circleList.insertHead(data1);
        circleList.insertHead(data2);
        circleList.insertTail(data3);
        circleList.insert(index, data4);
        System.out.println("Size of Linked List: " + circleList.size());
        circleList.display();
        circleList.remove(data1);
        System.out.println("Size of Linked List: " + circleList.size());
        circleList.display();
        System.out.println(data1 + " is in position " + circleList.index(data1));
        System.out.println("Head: " + circleList.getHead());
        System.out.println("Tail: " + circleList.getTail());

        System.out.println("###############################");
        System.out.println("#     Binary Search Tree      #");
        System.out.println("###############################");

        bst.insert(5);
        bst.insert(3);
        bst.insert(2);
        bst.insert(4);
        bst.insert(7);
        bst.insert(9);
        bst.insert(6);
        bst.remove(2);
        bst.remove(7);
        bst.remove(9);
        bst.display();

        System.out.println("###############################");
        System.out.println("#           AVL Tree          #");
        System.out.println("###############################");

        avl.insert(5);
        avl.insert(3);
        avl.insert(2);
        avl.insert(4);
        avl.insert(7);
        avl.insert(9);
        avl.insert(6);
        avl.display();
    }
}
