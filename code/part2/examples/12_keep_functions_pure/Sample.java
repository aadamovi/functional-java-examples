import java.util.*;
import java.util.stream.*;

public class Sample {
  public static void main(String[] args) {
    //Lambda expression should be pure functions
    //What is a pure function?
    //It has no side-effects.

    //There are two rules of purity:
    //1. No change by the function is visible outside of that function
    //2. The function does not depend on anything that may possible change

    int[] factor = new int[] { 2 };

    List<Integer> numbers = Arrays.asList(1, 2, 3);

    Stream<Integer> stream = numbers.stream()
      .map(e -> e * factor[0]);

    factor[0] = 0;

    stream.forEach(System.out::println);
    //lazy evaluation will yeild bad results, and so will parallel,
    //in the presence of impure functions.

    //It is our responsbility to make sure that functions used
    //in the functional pipeline are pure.
  }
}
