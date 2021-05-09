import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3);

    //the good old looping
    //for(int i = 0; i < numbers.size(); i++) {
    //  System.out.println(numbers.get(i));
    //}

    //a notch better
    for(int e: numbers) {
      System.out.println(e);
    }
    //simpler than above, but we often still have to use things like
    //break and continue to redirect the loop. In short, we are in the
    //business of controlling the loop.

    //the above are called as external iterators
    System.out.println("----------");
    //we can instead use internal iterators - where the iteration is
    //in autopilot and we don't have to control it

    //numbers.forEach((Integer e) -> System.out.println(e));
    //numbers.forEach(e -> System.out.println(e));
    numbers.forEach(System.out::println);

    //we can focus on what to do for each element and not have to
    //worry about how to move forward in the iteration.
  }
}
