package com.company;

    public class Main {
        public static void main(String[] args) {
            Arvore tree = new Arvore("A");

            tree.addLeft(tree.root, "B");
            tree.addRight(tree.root, "C");

            tree.addLeft(tree.root.left, "D");
            tree.addRight(tree.root.left, "E");

            tree.addRight(tree.root.right, "F");

            System.out.print("Árvore Binária em Pré-Ordem: ");
            tree.printTree(tree.root);
        }
    }
