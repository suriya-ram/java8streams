package java8;


import java.util.*;
import java.util.stream.Collectors;

public class EmployeeData {

    public static void main(String[] args) {

        List<Employee> empList = Arrays.asList(

                new Employee("Ravi", "IT", 55000),
                new Employee("Priya", "HR", 45000),
                new Employee("Kumar", "Finance", 65000),
                new Employee("Anita", "IT", 70000),
                new Employee("Suresh", "HR", 40000),
                new Employee("Meena", "Finance", 62000),
                new Employee("Arun", "IT", 48000)

        );
         

       Map<String,Double> deptSalary = empList.stream()
                                              .collect(Collectors.groupingBy(Employee::getDepartment,
                                               Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(deptSalary);
    }
}