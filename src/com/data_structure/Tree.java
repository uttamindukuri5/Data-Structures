package com.data_structure;

class Tree {
    Node root;

    Tree() { root=null; }

    boolean isEmpty() { return root == null; }

    private int getRoot() { return root.data; }

    Node getParent(Node node, int data) {
        if(getRoot() != data) {
            if(node.left.data == data || node.right.data == data)
                return node;
            else if (node.data > data)
                return getParent(node.left, data);
            else
                return getParent(node.right, data);
        }
        return null;
    }

    Node leftChild(Node node, int data) {
        return getNode(node, data).left;
    }

    Node rightChild(Node node, int data) {
        return getNode(node, data).right;
    }

    Node getNode(Node node, int data) {
        if(node.data == data)
            return node;
        else if(node.data > data)
            return getNode(node.left, data);
        else
            return getNode(node.right, data);
    }

    Node leftLeafNode(Node node) {
        if(node.left == null) {
            return node;
        }
        return leftLeafNode(node.left);
    }

    boolean isLeafNode(Node node) {
        return node.left == null && node.right == null;
    }

    void display() {
        traversal(root);
    }

    private void traversal(Node node) {
        if(node == null){
            return;
        }
        traversal(node.left);
        System.out.print(node.data + " ");
        traversal(node.right);
    }
}
