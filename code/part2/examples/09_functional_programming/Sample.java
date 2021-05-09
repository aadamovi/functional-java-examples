import java.util.*;

public class Sample {
  public static boolean isGT(int number) {
    System.out.println("isGT called for " + number);
    return number > 3;
  }

  public static boolean isEven(int number) {
    System.out.println("isEven called for " + number);
    return number % 2 == 0;
  }

  public static int doubleIt(int number) {
    System.out.println("doubleIt called for " + number);
    return number * 2;
  }

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);

    //imperative
    Integer result = null; //smell

    for(int e: numbers) {
      if(isGT(e) && isEven(e)) {
        result = doubleIt(e);
        break;
      }
    }

    //total of 8 units of work - we do not touch 6, 7, etc. in this example
    System.out.println(result);
    System.out.println("----------");
    //function

    System.out.println(
      numbers.stream()
        .filter(Sample::isGT)
	.filter(Sample::isEven)
	.map(Sample::doubleIt)
	.findFirst()
	.orElse(0));
    //The computational complexity of this code is the same
    //as that of imperative code.
    //Benefit, easy to parallelize, easy to maintain, less
    //accidental complexity as far as maintantenance.


    //Polymorphism is to Object-Oriented Programming as
    //Lazy Evaluation is to Functional Programming

    //Functional Programming == Functional composition + lazy evaluation

    //      List		Stream
    //      Bucket of data      Pipeline of functions

    //How does the functional pipeline run?
    //***It does not evaluate each stage in the pipeline on each data

    //It fuses the intermediate stages into one ball of a stage
    //Then it runs that fused stage, but only minimally, as necessary,
    //only when and until a terminal operation is satisfied.

    //Terminal operations (like findFirst) trigger the evaluation
    //of fused intermediate operations like filter and map.
  }
}
