import java.util.*;

public class Sample {
  public static void main(String[] args) {
    //declarative style: we tell what to do and *not* how to do it

    List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

    //is Nemo there?

    if(names.contains("Nemo")) {
      System.out.println("Nemo found");
    } else {
      System.out.println("Nemo not found");
    }
  }
}

//Declative style
//concise since we focus on the what and not how
//it honors the SLAP principle (Single Level of Abstraction Principle)
//avoid explicit mutability
//easier to write, easier to read, change, and maintain
