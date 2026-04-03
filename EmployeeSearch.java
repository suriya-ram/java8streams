package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employees {

  int id;
  String name;
  double salary;

  // Constructor
  public Employees(int id, String name, double salary) {
      this.id = id;
      this.name = name;
      this.salary = salary;
  }

  // Getter for salary
  public double getSalary() {
      return salary;
  }

  // toString method (for printing)
  @Override
  public String toString() {
      return id + " " + name + " " + salary;
  }

}
public class EmployeeSearch{
  public static void main(String[] args) {

        List<Employees> empList = Arrays.asList(
                new Employees(101, "Ravi", 45000),
                new Employees(102, "Priya", 65000),
                new Employees(103, "Kumar", 35000),
                new Employees(104, "Anita", 55000)
        );

    List<Employees>  emplistResult= empList.stream().sorted(Comparator.comparing(Employees::getSalary).reversed())
        .collect(Collectors.toList());
        System.out.println(emplistResult);
  }
}
