package java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatableCharacter {

  public static void main(String[] args) {
    

    String input = "swiss";
    Optional<Map.Entry<Character, Long>>map =input.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),
                LinkedHashMap::new,
                Collectors.counting()))
                .entrySet().stream()
                .filter(entry ->entry.getValue()==1)
                .findFirst();

                System.out.println(map);
  
  }
  
}
