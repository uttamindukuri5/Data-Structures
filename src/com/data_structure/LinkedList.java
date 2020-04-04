package com.data_structure;

import java.util.Objects;

class LinkedList {

    /**
     * Starting point of the Linked List
     */
    Node head;

    /**
     * Constructor - Creating a empty linked list
     */
    LinkedList() { head = null; }

    /**
     * Checks if the Linked List is empty
     * @return boolean
     */
    boolean isEmpty() { return head == null; }

    /**
     * Returns the size of the linked list
     * @return size of the array
     */
    int size() {
        int size = 0;
        Node node = head;
        while(node.next != null && node.next != head) {
            size++;
            node = node.next;
        }
        size = size + 1;
        return size;
    }

    /**
     * Returns the node at a given index
     * @param index - position of the node
     * @return - Node
     */
    Node getNode(int index) {
        Node node = head;
        int size = size();
        if(index < size) {
            for(int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        }
        return null;
    }

    /**
     * Returns the head of the linked list
     * @return the head of the linked list
     */
    int getHead() {
        return head.data;
    }

    /**
     * Returns the tail of the linked list
     * @return the tails of the linked list
     */
    int getTail() { return Objects.requireNonNull(getNode(size() - 1)).data; }

    /**
     * Returns the position of the linked list given a data
     * @param data - number
     * @return index of the Node in the linked list
     */
    int index(int data) {
        Node node = head;
        int size = size();
        for(int i = 0; i < size; i++) {
            if(node.data == data) return i;
            node = node.next;
        }
        return -1;
    }

    /**
     * Displays the linked list
     */
    void display() {
        Node current = head;
        while(current.next != null && current.next != head) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print(current.data + "->");
        System.out.print("null \n");
    }
}