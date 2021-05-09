import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3);

    //Stream<T>.map(Function<T, R>) ==> Stream<R>
    //map takes a one-to-one function and transforms the given stream

    List<Integer> result1 = numbers.stream()
       .map(e -> e + 1)
       .collect(toList());

    System.out.println(result1);
    
    //What is we have a one-to-many function.
    //map will take a stream and return a stream of collection instead
    //of a stream of values
    //Stream<T>.map(Function<T, List<R>>) ==> Stream<List<R>>

    List<List<Integer>> result2 = numbers.stream()
      .map(e -> Arrays.asList(e - 1, e + 1))
      .collect(toList());

    System.out.println(result2);

    //what if we have a one-to-many function but we want a
    //stream of values and not a stream of collection of value?
    //Stream<T>.flatMap(Function<T, Stream<R>>) ==> Stream<R>

    List<Integer> result3 = numbers.stream()
      .flatMap(e -> Stream.of(e - 1, e + 1))
      .collect(toList());

    System.out.println(result3);


    //If you have a one-to-one function, then use map.
    //If you have a one-to-many function, then use flatMap
  }
}

