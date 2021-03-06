package com.nathanvella.CrackingTheCodingInterview.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

  Node root;

  public void add(int value) {
    root = addRecursive(root, value);
  }

  private Node addRecursive(Node current, int value) {
    if (current == null)
      return new Node(value);

    if (value < current.value)
      current.left = addRecursive(current.left, value);
    else if (value > current.value)
      current.right = addRecursive(current.right, value);

    return current;
  }

  public boolean containsNode(int value) {
    return containsNodeRecursive(root, value);
  }

  private boolean containsNodeRecursive(Node current, int value) {
    if (current == null) {
      return false;
    }
    if (value == current.value) {
      return true;
    }
    return (value < current.value)
        ? containsNodeRecursive(current.left, value)
        : containsNodeRecursive(current.right, value);
  }

  public void deleteNode(int value) {
    root = deleteNodeRecursive(root, value);
  }

  private Node deleteNodeRecursive(Node current, int value) {
    if (current == null)
      return null;

    // Logic to delete node
    if (value == current.value) {
      // Case 1: no children
      if (current.left == null && current.right == null)
        return null;

      // Case 2: only 1 child
      if (current.right == null)
        return current.left;
      if (current.left == null) {
        return current.right;
      }

      // Case 3: 2 children
      int smallestValue = findSmallestValue(current.right);
      current.value = smallestValue;
      current.right = deleteNodeRecursive(current.right, smallestValue);
      return current;
    }

    if (value < current.value) {
      current.left = deleteNodeRecursive(current.left, value);
      return current;
    }
    current.right = deleteNodeRecursive(current.right, value);
    return current;
  }

  private int findSmallestValue(Node root) {
    return (root.left == null)
        ? root.value
        : findSmallestValue(root.left);
  }

  /* Created tree
          (6)
         /   \
       (4)   (8)
      /  \   /  \
    (3) (5) (7) (9) */

  // Depth-First Search: in-order, pre-order, post-order
  // output: 3 4 5 6 7 8 9
  public void traverseInOrder(Node node) {
    if (node != null) {
      traverseInOrder(node.left);;
      visit(node.value);
      traverseInOrder(node.right);
    }
  }
  // output: 6 4 3 5 8 7 9
  public void traversePreOrder(Node node) {
    if (node != null) {
      visit(node.value);
      traversePreOrder(node.left);
      traversePreOrder(node.right);
    }
  }

  // output: 3 5 4 7 9 8 6
  public void traversePostOrder(Node node) {
    if (node != null) {
      traversePostOrder(node.left);
      traversePostOrder(node.right);
      visit(node.value);
    }
  }

  // Breadth-First Search
  // output: 6 4 8 3 5 7 9
  public void traverseLevelOrder() {
    if (root == null)
      return;

    Queue<Node> nodes = new LinkedList<>();
    nodes.add(root);

    while(!nodes.isEmpty()) {
      Node node = nodes.remove();
      visit(node.value);

      if (node.left != null)
        nodes.add(node.left);
      if (node.right != null)
        nodes.add(node.right);
    }
  }

  private void visit(int value) {
    System.out.println(" " + value);
  }

  class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
      this.value = value;
      right = null;
      left = null;
    }
  }

}


