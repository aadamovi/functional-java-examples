import java.util.*;

public class Sample {
  public static void main(String[] args) {
    //functional style == declarative style + higher-order functions

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    //find the total of double of even numbers

    System.out.println(
      numbers.stream()
        .filter(e -> e % 2 == 0) //functional: declarative + higher-order function
	.mapToInt(e -> e * 2)    //functional: declarative + higher-order function
	.sum()                   //declarative
    );

    //Code follow the SLAP principle
    //Code begins to read like the problem statement
    // given the numbers
    // pick the even numbers
    // double themd
    // total
  }
}

