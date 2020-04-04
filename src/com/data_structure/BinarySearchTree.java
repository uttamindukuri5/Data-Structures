package com.data_structure;

import org.jetbrains.annotations.NotNull;

class BinarySearchTree extends Tree{

    BinarySearchTree() { root=null; }

    void insert(int data) {
        if(isEmpty())
            root = new Node(data);
        else
            insert(root, data);
    }

    @NotNull
    private Node insert(Node node, int data) {
        if(node == null)
            node = new Node(data);
        else if(node.data > data)
            node.left = insert(node.left, data);
        else
            node.right = insert(node.right, data);
        return node;
    }

    void remove(int data) { remove(root, data); }

    private void remove(Node node, int data) {
        Node parent = getParent(node, data);
        Node rightChild = rightChild(node, data);
        Node leftChild = leftChild(node, data);
        Node current = getNode(node, data);
        if(!isLeafNode(current)) {
            if(rightChild != null) {
                Node leafNode = leftLeafNode(rightChild);
                if (parent == null)
                    root = rightChild;
                else if (parent.left.data == data) {
                    parent.left = null;
                    parent.left = rightChild;
                } else {
                    parent.right = null;
                    parent.right = rightChild;
                }
                if (leftChild != null) {
                    leafNode.left = leftChild;
                }
            }
            else {
                if (parent.left.data == data) {
                    parent.left = null;
                    parent.left = leftChild;
                } else {
                    parent.right = null;
                    parent.right = leftChild;
                }
            }
        } else {
            if(parent.left.data == data)
                parent.left = null;
            else
                parent.right = null;
        }
        current.left = null;
        current.right = null;
    }
}
