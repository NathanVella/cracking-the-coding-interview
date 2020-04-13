package com.nathanvella.CrackingTheCodingInterview.modules;

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
    Assertions.assertFalse(arraysAndStrings.checkPermutation("nathan", "vellan"));
    Assertions.assertFalse(arraysAndStrings.checkPermutation("nate", "erin"));
  }

  @Test
  @Disabled
  void urlify() {
    Assertions.assertEquals("",
        arraysAndStrings.urlify("", 0));
    Assertions.assertEquals("%20",
        arraysAndStrings.urlify("   ", 1));
    Assertions.assertEquals("Mr%20John%20Smith",
        arraysAndStrings.urlify("Mr John Smith    ", 13));
  }

  @Test
  @Disabled
  void palindromePermutation() {
    Assertions.assertTrue(arraysAndStrings.palindromePermutation("Tact Coa"));
  }

  @Test
  @Disabled
  void oneAway() {
    Assertions.assertTrue(arraysAndStrings.oneAway("pale", "ple"));
    Assertions.assertTrue(arraysAndStrings.oneAway("pales", "pale"));
    Assertions.assertTrue(arraysAndStrings.oneAway("pale", "bale"));
    Assertions.assertFalse(arraysAndStrings.oneAway("pale", "bake"));
  }

  @Test
  @Disabled
  void stringCompression() {
    Assertions.assertEquals("a2b1c5a3",
        arraysAndStrings.stringCompression("aabcccccaaa"));
  }

  @Test
  void rotateMatrix() {

  }

  @Test
  void zeroMatrix() {

  }

  @Test
  void stringRotation() {

  }
}