package com.data_structure;

import org.jetbrains.annotations.NotNull;

public class AVL extends Tree {
    AVL() { root=null; }

    void insert(int data) {
        if(isEmpty())
            root = new Node(data, 0);
        else {
            insert(root, data, 0);
            //balance = balance(root);


        }
    }

    @NotNull
    private Node insert(Node node, int data, int height) {
        if(node == null)
            node = new Node(data, height);
        else if(node.data > data)
            node.left = insert(node.left, data, ++height);
        else
            node.right = insert(node.right, data, ++height);
        return node;
    }

    public void display() {
        traversal(root);
    }

    private void traversal(Node node) {
        if(node == null) {
            return;
        }
        traversal(node.left);
        System.out.print("[N:" + node.data + " H:" + node.height + "]");
        traversal(node.right);
        System.out.println();
    }

}
