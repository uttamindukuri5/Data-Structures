package com.data_structure;

import java.util.Objects;

class DoubleLinkedList extends LinkedList {

    /**
     * Constructor - Creating a empty linked list
     */
    DoubleLinkedList() { head = null; }

    /**
     * If the Linked List is empty creates a head otherwise
     * calls a function to append a new node as the head
     * @param data - number
     */
    void insertHead(int data) {
        if(isEmpty())
            head = new Node(data);
        else
            addHead(data);
    }

    /**
     * Appends new node as the head
     * @param data - number
     */
    private void addHead(int data) {
        Node temp = this.head;
        head = new Node(data);
        head.next = temp;
        temp.prev = head;
    }

    /**
     * If the linked list is empty creates a head otherwise
     * calls a function to append new nose at the tail or at
     * the end of the Linked List
     * @param data - number
     */
    void insertTail(int data) {
        if(isEmpty())
            head = new Node(data);
        else
            addTail(head, data);
    }

    /**
     * Appends new node at the end of the Linked List known
     * as the tail.
     * @param node - linked list node
     * @param data - number
     */
    private void addTail(Node node, int data) {
        Node temp = new Node(data);
        while(node.next != null) {
            node = node.next;
        }
        node.next = temp;
        temp.prev = node;
    }

    /**
     * If the linked list is empty creates a head otherwise
     * calls a function to append the node anywhere in the
     * linked list.
     * @param insertIndex - index that the user wants to insert the node
     * @param data - number
     */
    void insert(int insertIndex, int data) {
        if(super.isEmpty())
            head = new Node(data);
        else
            insertNode(insertIndex, data);
    }

    /**
     * Append a new node anywhere in the Linked List
     * @param insertIndex - index that the user wants to insert the node
     * @param data - number
     */
    private void insertNode(int insertIndex, int data) {
        try {
            if (insertIndex == 0)
                addHead(data);
            else {
                Node insertNode = new Node(data);
                Node previousNode = getNode(--insertIndex);
                Node nextNode = getNode(++insertIndex);
                insertNode.next = nextNode;
                nextNode.prev = insertNode;
                insertNode.prev = previousNode;
                previousNode.next = insertNode;
            }
        } catch(Exception e) {
            System.out.println("ERROR: " + e);
        }
    }

    /**
     * Removes a node from the linked list
     * @param data - number
     */
    void remove(int data) {
        int index = index(data);
        int position = index;
        Node removeNode = getNode(index);
        Node previousNode = getNode(--position);
        position = index;
        Node nextNode = getNode(++position);
        if(index == 0) {
            head = nextNode;
            nextNode.prev = null;
        } else if (index == size() - 1) {
            Objects.requireNonNull(previousNode).next = null;
            Objects.requireNonNull(removeNode).prev = null;
        } else {
            Objects.requireNonNull(previousNode).next = nextNode;
            Objects.requireNonNull(nextNode).prev = previousNode;
            Objects.requireNonNull(removeNode).next = null;
            Objects.requireNonNull(removeNode).prev = null;
        }
    }
}