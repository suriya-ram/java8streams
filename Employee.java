package java8;

class Employee {

  String name;
  String department;
  double salary;

  // Constructor
  public Employee(String name, String department, double salary) {
      this.name = name;
      this.department = department;
      this.salary = salary;
  }

  // Getters
  public String getName() {
      return name;
  }

  public String getDepartment() {
      return department;
  }

  public double getSalary() {
      return salary;
  }

  // toString()
  @Override
  public String toString() {
      return name + " | " + department + " | " + salary;
  }
}