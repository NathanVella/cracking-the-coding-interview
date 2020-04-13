package com.nathanvella.CrackingTheCodingInterview.util;

import java.util.Arrays;

public class StringUtil {

  public static String sortString(String s) {
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }

}
