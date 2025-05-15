package com.company;

class Arvore {
    No root;

    public Arvore(String rootValue) {
        root = new No(rootValue);
    }

    public void addLeft(No parent, String value) {
        parent.left = new No(value);
    }

    public void addRight(No parent, String value) {
        parent.right = new No(value);
    }

    public void printTree(No node) {
        if (node != null) {
            System.out.print(node.value + " ");
            printTree(node.left);
            printTree(node.right);
        }
    }
}

