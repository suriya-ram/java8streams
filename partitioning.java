package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class partitioning {

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 3, 4, 2, 5, 6, 67, 9, 8, 10);

    Map<Boolean, List<Integer>> output = numbers.stream()
        .collect(Collectors.partitioningBy(n -> n % 2 == 0));

    // System.out.println(output.get(true));

    List<String> words = Arrays.asList(
        "cat",
        "dog",
        "elephant",
        "tiger",
        "lion",
        "ant");
     Map<Integer,List<String>> outputres=    words.stream().collect(Collectors.groupingBy(String::length));
     System.out.println(outputres);
  }

}
