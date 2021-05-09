package com.agiledeveloper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;

interface Util {
  static boolean isPrime(int number) {
    return number > 1 && IntStream.range(2, number)
        .noneMatch(i -> number % i == 0);
  }

  static long countWordsInFile(String filePath, String searchWord) throws IOException {
    return Files.lines(Paths.get(filePath))
        .filter(line -> line.contains(searchWord))
        .count();
  }
}