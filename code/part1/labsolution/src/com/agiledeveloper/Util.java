package com.agiledeveloper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;

interface Util {
  public static boolean isPrime(int number) {
    //given a number, there is no number in the range 2 to number - 1 that matches division

    return number > 1 && IntStream.range(2, number)
      .noneMatch(i -> number % i == 0);
  }

  public static long countWordsInFile(String filePath, String searchWord) throws IOException {
    return Files.lines(Paths.get(filePath))
      .filter(line -> line.contains(searchWord))
      .count();
  }
}