package com.nathanvella.CrackingTheCodingInterview.datastructures;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BinaryTreeTests {


  private BinaryTree createBinaryTree() {
    /* Created tree
          (6)
         /   \
       (4)   (8)
      /  \   /  \
    (3) (5) (7) (9) */

    BinaryTree bt = new BinaryTree();

    bt.add(6);
    bt.add(4);
    bt.add(8);
    bt.add(3);
    bt.add(5);
    bt.add(7);
    bt.add(9);

    return bt;
  }

  @Test
  public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
    BinaryTree bt = createBinaryTree();

    assertTrue(bt.containsNode(3));
    assertTrue(bt.containsNode(4));
    assertTrue(bt.containsNode(5));
    assertTrue(bt.containsNode(6));
    assertTrue(bt.containsNode(7));
    assertTrue(bt.containsNode(8));
    assertTrue(bt.containsNode(9));

    assertFalse(bt.containsNode(1));
    assertFalse(bt.containsNode(2));
  }

  @Test
  public void givenABinaryTree_WhenDeletingElements_ThenTreeDoesNotContainThoseElements() {
    BinaryTree bt = createBinaryTree();

    assertTrue(bt.containsNode(9));
    bt.deleteNode(9);
    assertFalse(bt.containsNode(9));
  }

}
