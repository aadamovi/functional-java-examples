package com.agiledeveloper;

import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

interface Util {
  private static Predicate<String> checkLengthOfName(int length) {
    return name -> name.length() == length;
  }

  static List<String> getNamesOfLength4(List<String> names) {
    return names.stream()
      .filter(checkLengthOfName(4))
      .collect(toList());
  }

  static List<String> getNamesOfLength5InUpperCase(List<String> names) {
    return names.stream()
      .filter(checkLengthOfName(5))
      .map(String::toUpperCase)
      .collect(toList());
  }

  static List<String> getInUpperCaseNamesOfLength4AndHavingL(List<String> names) {
    return names.stream()
      .filter(checkLengthOfName(4))
      .filter(name -> name.contains(("l")))
      .map(String::toUpperCase)
      .collect(toList());
  }
}