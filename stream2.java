package java8;

import java.util.Arrays;
import java.util.*;

public class stream2 {

  public static void main(String[] args) {

    List<List<Integer>> numList = Arrays.asList(
        Arrays.asList(1, 2, 3),
        Arrays.asList(4, 5, 6),
        Arrays.asList(7, 8, 9));
    List<Integer> singleList = numList.stream().flatMap(List::stream).toList();
    // System.out.println(singleList);

    List<String> strings = Arrays.asList("", "", "name", "bhaiya");
    Optional stringResult = strings.stream().filter(n -> !n.isEmpty())
        .findFirst();
   // System.out.println(stringResult.get());

    List<Integer> numLi = Arrays.asList(1,9,100,80,17,99);
   Optional res= numLi.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst();
   System.out.println(res.get());
  }
}
