import java.util.*;

public class Sample {
  public static void main(String[] args) {
    //lambdas are stateless
    //they take input (possibly) and produce output (possibly)

    List<Integer> numbers = Arrays.asList(1, 2, 3);

    numbers.stream()
      .map(e -> e * 2) //lambda. e is a parameter and function uses that parameter and a constant. No state
      .forEach(System.out::println);

    final int factor = 2;

    numbers.stream()
      .map(e -> e * factor) //let us examine this
      .forEach(System.out::println);

    //the above is a lambda with e as parameter, but it has a factor
    //that is not defined within the lamba.
    //For this lambda to be useful, we have to bind the factor to
    //a variable. The compiler looks around to the defining scope of
    //the lambda to see if it can find the factor variable.
    //It will look in main (in this example), in the class, in the 
    //outer class, etc. defining scope, defining scope's definining scope, ...


    //This process is called close-over the scope.
    //The compiler closes over the defining scope to bind factor.
    //Thus this lambda is called a closure.

    //a lambda has no unbounded variables
    //a closure has variables that it has to close over - that is
    //it has external (better be immutable) state.
  }
}
