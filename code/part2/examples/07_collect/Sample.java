import java.util.*;
import static java.util.stream.Collectors.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    //Never do the following:
    List<Integer> result = new ArrayList<>();

    numbers.stream()
      .filter(e -> e % 2 == 0)
      .map(e -> e * 2)
      .forEach(e -> result.add(e));  //bad idea
      //why should we not do this?
      //We are doing shared mutability which is evil
      //thus this code can't not run correctly as a parallel stream
      //we may lose data due to race condition

    System.out.println(result);

    //use collect instead
    System.out.println(
      numbers.stream()
        .filter(e -> e % 2 == 0)
	.map(e -> e * 2)
	.collect(toList()));
    //collect is a reduce that is thread-safe to return a collection
    //as a result
  }
}

