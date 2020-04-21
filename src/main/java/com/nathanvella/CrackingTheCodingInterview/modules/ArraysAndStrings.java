package com.nathanvella.CrackingTheCodingInterview.modules;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraysAndStrings {

  /**
   * Is Unique
   * Implement an algorithm to determine if a string has all unique characters.
   * What if you cannot use additional data structures?
   */
  public boolean isUnique(String s) {
    Map<Character, Integer> map = new HashMap();
    for (int i = 0; i < s.length(); i++) {
      if (map.containsKey(s.charAt(i))) {
        return false;
      } else {
        map.put(s.charAt(i), 1);
      }
    }
    return true;
  }

  /**
   * Check Permutation
   * Given two strings, write a method to decide if one is a permutation of the other.
   */
  public boolean checkPermutation(String s1, String s2) {
    if (s1.length() == s2.length()) {
      return sort(s1).equals(sort(s2));
    }
    return false;
  }

  public static String sort(String s) {
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }

  /**
   * URLify
   * Write a method to replace all spaces in a string with '%20'.
   * You may assume that the string has sufficient space at the end to hold the
   * additional characters, and that you are given the "true" length of the string.
   * (Note: if implementing in Java, please use a character array so
   * that you can perform this operation in place.)
   *
   * EXAMPLE
   * Input:   "Mr John Smith    ", 13
   * Output:  "Mr%20John%20Smith"
   */
  public String replaceSpaces(String s, int trueLength) {
    char[] str = s.toCharArray();

    int spaceCount = 0, index, i = 0;
    for (i = 0; i < trueLength; i++) {
      if (str[i] == ' ') {
        spaceCount++;
      }
    }

    index = trueLength + spaceCount * 2;
    if (trueLength < str.length) {
      str[trueLength] = '\0';
    }
    for (i = trueLength - 1; i >= 0; i--) {
      if (str[i] == ' ') {
        str[index - 1] = '0';
        str[index - 2] = '2';
        str[index - 3] = '%';
        index = index - 3;
      } else {
        str[index - 1] = str[i];
        index--;
      }
    }
    return new String(str);
  }

  /**
   * Palindrome Permutation
   * Given a string, write a function to check if it is a
   * permutation of a palindrome. A palindrome is a word or phrase that is
   * the same forwards and backwards. A permutation is a rearrangement of letters.
   * The palindrome does not need to be limited to just dictionary words.
   *
   * EXAMPLE
   * Input:   Tact Coa
   * Output:  True (permutations: "taco cat", "atco eta", etc.)
   */
  public boolean palindromePermutation(String s) {

    return true;
  }

  /**
   * One Away
   * There are three types of edits that can be performed on strings:
   *     insert a character, remove a character, replace a character. Given two
   * strings, write a function to check if they are one edit (or zero edits) away.

   * EXAMPLE
   * pale, ple    -> true
   * pales, pale  -> true
   * pale, bale   -> true
   * pale, bake   -> false
   */
  public boolean oneAway(String s1, String s2) {

    return true;
  }

  /**
   * String Compression
   * Implement a method to perform basic string compression using the counts of repeated
   * characters. If the "compressed" string would not become smaller than the original
   * string,your method should return the original string. You can assume the string
   * has only uppercase and lowercase letters (a - z).
   *
   * EXAMPLE
   * aabcccccaaa  -> a2b1c5a3
   */
  public String stringCompression(String s) {
    return "";
  }

  /**
   * Rotate Matrix
   * Given an image represented by an NxN matrix, where each pixel in the
   * image is 4 bytes, write a method to rotate the image by 90 degrees.
   * Can you do this in place?
   */
  public void rotateMatrix() {

  }

  /**
   * Zero Matrix
   * Write an algorithm such that if an element in an MxN matrix is 0,
   * its entire row and column are set to 0.
   */
  public void zeroMatrix() {

  }

  /**
   * String Rotation
   * Assume you have a method isSubstring which checks if one word is a substring of
   * another. Given two strings, sl and s2, write code to check if s2 is a rotation of
   * s1 using only one call to isSubstring.
   * (e.g.,"waterbottle" is a rotation of "erbottlewat").
   */
  public boolean isSubstring(String s1, String s2) {
    return true;
  }
}
