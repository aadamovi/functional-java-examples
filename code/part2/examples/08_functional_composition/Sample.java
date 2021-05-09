import java.util.*;
import static java.util.stream.Collectors.*;

public class Sample {
  public static void main(String[] args) {
    //functional composition is nice, it is essential but not sufficent

    List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

    System.out.println(
      names.stream()
        .filter(name -> name.length() == 4)
	.map(String::toUpperCase)
	.collect(toList()));

    //Functional composition:
    //several examples in our world that resemble this:
    // Unix:  cat source.txt | grep "something" | sed ... | wc -l
    //             stream    | filter           | map     | reduce

    //             air       | purifier         | heater  | ...
    //             water     | purifier'        | cooler  | ...
  }
}
