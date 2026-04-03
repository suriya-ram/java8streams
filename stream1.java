package java8;
import java.util.*;
import java.util.stream.Collectors;
public class stream1 {
  public static void main (String args[]){


    // List<Integer> numList = Arrays.asList(1,3,9,10,2,10,1);

    // OptionalDouble numResult = numList.stream().mapToInt(Integer::intValue).average();
    // //System.out.println(numResult.getAsDouble());
    // List<Integer>sortedList =numList.stream().sorted(Comparator.reverseOrder()).toList();
    // System.out.println(sortedList);

    List<String> fruits = Arrays.asList("Apple","Banana","Avacodo","Apricot","Mango");
    long fruitsResult = fruits.stream().filter(n->n.startsWith("A")).count();
    //System.out.println(fruitsResult);

    String fruitRes= fruits.stream().collect(Collectors.joining(",","{","}"));
    //System.out.println(fruitRes);

    List<Integer> numListInput = Arrays.asList(1,6,9,10);
    boolean b =numListInput.stream().allMatch(n-> n>0);
    //System.out.println(b);

    boolean match= numListInput.stream().anyMatch(n->n%3 ==0);
    System.out.println(match);
  }
  
}
