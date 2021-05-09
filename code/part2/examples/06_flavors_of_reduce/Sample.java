import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    System.out.println(numbers.stream()
      .filter(e -> e % 2 == 0)
      .mapToInt(e -> e * 2)
      .sum());


    //reduce comes in different flavors:
    //reduce
    //sum
    //min
    //max
    //collect
    //...

    //reduce is an operation that either results in a single value
    //or a collection of values.

    //reduce transforms a stream into a single value or
    //another collection.
  }
}

