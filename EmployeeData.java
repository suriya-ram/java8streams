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
                new Employee("Suresh", "HR", 4000000),
                new Employee("Meena", "Finance", 62000),
                new Employee("Arun", "IT", 48000),
                new Employee("soja", "IT", 87000),
                new Employee("konna", "Finance", 92000)
        );
         

       Map<String,Double> deptSalary = empList.stream()
                                              .collect(Collectors.groupingBy(Employee::getDepartment,
                                               Collectors.averagingDouble(Employee::getSalary)));
       // System.out.println(deptSalary);

       //2. group by department and return their max salary of corresponding department

      Map<String,Optional<Employee>>finalList = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                               Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
      //System.out.println(finalList);  
      
      //3.group employees by department and if each department has greater than 2 ppl return it

      Map<String,Long> map=empList.stream().collect(Collectors.groupingBy(Employee:: getDepartment,Collectors.counting()));
     // System.out.println(map);
      List<Map.Entry<String,Long>>list =  map.entrySet().stream().filter(e->e.getValue()>2)
                                              .toList();
      //System.out.println(list); 
      
      //4.group Employee by department, return the average of salary which is maximum

     Map<String,Double>result = empList.stream()
                                   .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
     System.out.println(result); 
     Map.Entry<String,Double>resultList =result.entrySet().stream().max(Map.Entry.comparingByValue()) 
                       .orElseThrow()  ; 
     System.out.println(resultList);                                           
    }
}