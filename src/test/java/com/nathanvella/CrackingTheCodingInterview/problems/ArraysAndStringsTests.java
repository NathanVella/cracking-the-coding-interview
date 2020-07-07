package com.nathanvella.CrackingTheCodingInterview.problems;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ArraysAndStringsTests {

  @InjectMocks
  ArraysAndStrings arraysAndStrings;

  @Test
  void isUnique() {
    Assertions.assertTrue(arraysAndStrings.isUnique(""));
    Assertions.assertTrue(arraysAndStrings.isUnique("abcdefghijklmnopqrstuvwxyz"));
    Assertions.assertTrue(arraysAndStrings.isUnique("oliver"));
    Assertions.assertTrue(arraysAndStrings.isUnique("abc"));

    Assertions.assertFalse(arraysAndStrings.isUnique("aa"));
    Assertions.assertFalse(arraysAndStrings.isUnique("nathan"));
    Assertions.assertFalse(arraysAndStrings.isUnique("garrett"));
    Assertions.assertFalse(arraysAndStrings.isUnique("vella"));
  }

  @Test
  void checkPermutation() {
    Assertions.assertTrue(arraysAndStrings.checkPermutation("", ""));
    Assertions.assertTrue(arraysAndStrings.checkPermutation("a", "a"));
    Assertions.assertTrue(arraysAndStrings.checkPermutation("ba", "ab"));
    Assertions.assertTrue(arraysAndStrings.checkPermutation("aabbccddeeff", "fbcaedfbcaed"));

    Assertions.assertFalse(arraysAndStrings.checkPermutation("a", "aa"));
    Assertions.assertFalse(arraysAndStrings.checkPermutation(" ", "a"));
    Assertions.assertFalse(arraysAndStrings.checkPermutation("nathan", "vella"));
    Assertions.assertFalse(arraysAndStrings.checkPermutation("nate", "erin"));
  }

  @Test
  void replaceSpaces() {
    Assertions.assertEquals("",
        arraysAndStrings.replaceSpaces("", 0));
    Assertions.assertEquals("%20",
        arraysAndStrings.replaceSpaces("   ", 1));
    Assertions.assertEquals("Mr%20John%20Smith",
        arraysAndStrings.replaceSpaces("Mr John Smith    ", 13));
  }

  @Test
  void palindromePermutation() {
    Assertions.assertTrue(arraysAndStrings.palindromePermutation(""));
    Assertions.assertTrue(arraysAndStrings.palindromePermutation(" "));
    Assertions.assertTrue(arraysAndStrings.palindromePermutation("Taco Cat"));
    Assertions.assertTrue(arraysAndStrings.palindromePermutation("Tact Coa"));
    Assertions.assertTrue(arraysAndStrings.palindromePermutation("atco cta"));

    Assertions.assertFalse(arraysAndStrings.palindromePermutation("nathan"));
    Assertions.assertFalse(arraysAndStrings.palindromePermutation("assert false"));
    Assertions.assertFalse(arraysAndStrings.palindromePermutation("not a palindrome permutation"));
  }

  @Test
  void oneEditAway() {
    Assertions.assertTrue(arraysAndStrings.oneEditAway("pale", "ple"));
    Assertions.assertTrue(arraysAndStrings.oneEditAway("pales", "pale"));
    Assertions.assertTrue(arraysAndStrings.oneEditAway("pale", "bale"));

    Assertions.assertFalse(arraysAndStrings.oneEditAway("pale", "bake"));
  }

  @Test
  void oneEditAwayEnhanced() {
    Assertions.assertTrue(arraysAndStrings.oneEditAwayEnhanced("pale", "ple"));
    Assertions.assertTrue(arraysAndStrings.oneEditAwayEnhanced("pales", "pale"));
    Assertions.assertTrue(arraysAndStrings.oneEditAwayEnhanced("pale", "bale"));

    Assertions.assertFalse(arraysAndStrings.oneEditAwayEnhanced("pale", "bake"));
  }

  @Test
  void stringCompression() {
    Assertions.assertEquals("a2b1c5a3", arraysAndStrings.stringCompression("aabcccccaaa"));
    Assertions.assertEquals("nathan", arraysAndStrings.stringCompression("nathan"));
    Assertions.assertEquals("", arraysAndStrings.stringCompression(""));
    Assertions.assertEquals("a10", arraysAndStrings.stringCompression("aaaaaaaaaa"));
  }

  @Test
  void rotateMatrix() {
    int[][] twoByTwo = {
        {0, 1},
        {2, 3}};

    int[][] twoByTwoRotated = {
        {2, 0},
        {3, 1}};

    int[][] threeByThree = {
        {0, 1, 2},
        {3, 4, 5},
        {6, 7, 8}};

    int[][] threeByThreeRotated = {
        {6, 3, 0},
        {7, 4, 1},
        {8, 5, 2}};

    int[][] fourByFour = {
        {0, 1, 2, 3},
        {4, 5, 6, 7},
        {8, 9, 10, 11},
        {12, 13, 14, 15}};

    int[][] fourByFourRotated = {
        {12, 8, 4, 0},
        {13, 9, 5, 1},
        {14, 10, 6, 2},
        {15, 11, 7, 3}};

    Assertions.assertEquals(
        Arrays.deepToString(twoByTwoRotated),
        Arrays.deepToString(arraysAndStrings.rotateMatrix(twoByTwo)));

    Assertions.assertEquals(
        Arrays.deepToString(threeByThreeRotated),
        Arrays.deepToString(arraysAndStrings.rotateMatrix(threeByThree)));

    Assertions.assertEquals(
        Arrays.deepToString(fourByFourRotated),
        Arrays.deepToString(arraysAndStrings.rotateMatrix(fourByFour)));
  }

  @Test
  void zeroMatrix() {
    int[][] twoByTwo = {
        {0, 1},
        {2, 3}};

    int[][] twoByTwoNulled = {
        {0, 0},
        {0, 3}};

    int[][] threeByThree = {
        {1, 0, 2},
        {3, 4, 5},
        {6, 7, 8}};

    int[][] threeByThreeNulled = {
        {0, 0, 0},
        {3, 0, 5},
        {6, 0, 8}};

    int[][] fourByFour = {
        {1, 1, 2, 3},
        {4, 5, 6, 7},
        {8, 9, 0, 11},
        {12, 13, 14, 15}};

    int[][] fourByFourNulled = {
        {1, 1, 0, 3},
        {4, 5, 0, 7},
        {0, 0, 0, 0},
        {12, 13, 0, 15}};

    Assertions.assertEquals(
        Arrays.deepToString(twoByTwoNulled),
        Arrays.deepToString(arraysAndStrings.zeroMatrix(twoByTwo)));

    Assertions.assertEquals(
        Arrays.deepToString(threeByThreeNulled),
        Arrays.deepToString(arraysAndStrings.zeroMatrix(threeByThree)));

    Assertions.assertEquals(
        Arrays.deepToString(fourByFourNulled),
        Arrays.deepToString(arraysAndStrings.zeroMatrix(fourByFour)));
  }

  @Test
  void zeroMatrixEnhanced() {
    int[][] twoByTwo = {
        {0, 1},
        {2, 3}};

    int[][] twoByTwoNulled = {
        {0, 0},
        {0, 3}};

    int[][] threeByThree = {
        {1, 0, 2},
        {3, 4, 5},
        {6, 7, 8}};

    int[][] threeByThreeNulled = {
        {0, 0, 0},
        {3, 0, 5},
        {6, 0, 8}};

    int[][] fourByFour = {
        {1, 1, 2, 3},
        {4, 5, 6, 7},
        {8, 9, 0, 11},
        {12, 13, 14, 15}};

    int[][] fourByFourNulled = {
        {1, 1, 0, 3},
        {4, 5, 0, 7},
        {0, 0, 0, 0},
        {12, 13, 0, 15}};

    Assertions.assertEquals(
        Arrays.deepToString(twoByTwoNulled),
        Arrays.deepToString(arraysAndStrings.zeroMatrixEnhanced(twoByTwo)));

    Assertions.assertEquals(
        Arrays.deepToString(threeByThreeNulled),
        Arrays.deepToString(arraysAndStrings.zeroMatrixEnhanced(threeByThree)));

    Assertions.assertEquals(
        Arrays.deepToString(fourByFourNulled),
        Arrays.deepToString(arraysAndStrings.zeroMatrixEnhanced(fourByFour)));
  }

  @Test
  void stringRotation() {
    Assertions.assertTrue(arraysAndStrings.isRotation("waterbottle", "erbottlewat"));
    Assertions.assertTrue(arraysAndStrings.isRotation("nathanvella", "anvellanath"));

    Assertions.assertFalse(arraysAndStrings.isRotation("abcdef", "hij"));
    Assertions.assertFalse(arraysAndStrings.isRotation("a", ""));
  }
}