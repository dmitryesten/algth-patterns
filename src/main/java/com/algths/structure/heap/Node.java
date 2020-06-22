package com.algths.structure.heap;

public class Node<N> {

    int index;
    int value;
    Node<N> leftNode;
    Node<N> rightNode;

    public Node (int index, int value, Node leftNode, Node rightNode) {
        this.index = index;
        this.value = value;

        if(leftNode == null && rightNode != null) {
            leftNode = rightNode;
            rightNode = null;
        }

        this.leftNode = leftNode;
        this.rightNode = rightNode;

    }

}
