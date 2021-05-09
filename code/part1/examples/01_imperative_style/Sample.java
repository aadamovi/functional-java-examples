import java.util.*;

public class Sample {
  public static void main(String[] args) {
    //imperative style: we tell what to do and also how to do it

    List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

    //is Nemo there?

    boolean found = false; //garbage variable - needed by the solution we choose

    //for(int i = 0; i < ...  //how...
    for(String name: names) {
      //if(name == "Nemo") //how...
      if(name.equals("Nemo")) {
        found = true; //mutation
	break; //how
      }
    }

    if(found) {
      System.out.println("Nemo found");
    } else {
      System.out.println("Nemo not found");
    }
  }
}

//Imperative style
//mutation - error prone, hard to parallelize
//verbose
//it is very familiar but not simple
//has many moving parts
//easy to write initially because we are familiar but hard to
//read and to change/maintain in the long run
