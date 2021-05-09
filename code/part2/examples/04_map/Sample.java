import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    numbers.stream()
      .map(e -> e * 2.0)
      .forEach(System.out::println);
  }
}

//map
//  given x1, x2, ..., xn 
//  yi = f(xi)
//  output y1, y2,..., yn
//  we transform each element in the output using the given function

// map takes a Function<T, R>
// Stream<T>.map(Function<T, R>) ==> Stream<R>

// # of elements in the output == # of elements in the input
// The value and the type of the elements in the output may be
// different from the value and the type of elements in the input

