package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countOccurences {

  public static void main(String[] args) {
    List<String> words = Arrays.asList(
        "cat",
        "dog",
        "elephant",
        "tiger",
        "lion",
        "ant",
        "ant");

       Map<String,Long> map= words.stream()
                                  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    
  }
  
}
