package java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentCharacter {

  public static void main(String args[]){

   String input = "banana";
   Map<Character,Long> result = input.chars().mapToObj(c-> (char)c)
         .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
   //System.out.println(result);
   Map.Entry<Character,Long>resultList =result.entrySet()
                                             .stream().max(Map.Entry.comparingByValue())
                                             .orElseThrow();
          
    System.out.println(resultList);                                         
  }
  
}
