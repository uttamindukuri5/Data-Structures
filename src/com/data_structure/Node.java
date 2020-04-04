package com.data_structure;

class Node {
    int data, height;
    Node next, left, right, prev;

    Node(int data) {
        this.data = data;
        right = null;
        left = null;
        next = null;
        prev = null;
    }

    Node(int data, int height) {
        this.data = data;
        this.height = height;
        right = null;
        left = null;
        next = null;
        prev = null;
    }
}