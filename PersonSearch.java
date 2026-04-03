package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

class Person {

  int id;
  String name;
  int age;

  // Constructor
  public Person(int id, String name, int age) {
      this.id = id;
      this.name = name;
      this.age = age;
  }

  // Getter for age
  public int getAge() {
      return age;
  }

  // toString method
  @Override
  public String toString() {
      return id + " " + name + " " + age;
  }
}
public class PersonSearch {
  public static void main(String[] args) {
    List<Person> personList = Arrays.asList(

        new Person(1, "Ravi", 28),
        new Person(2, "Priya", 24),
        new Person(3, "Kumar", 32),
        new Person(4, "Anita", 26),
        new Person(5, "Suresh", 30)

);

  OptionalDouble result =personList.stream().mapToInt(Person::getAge).average();
  System.out.println(result.getAsDouble());
  }
  
}
