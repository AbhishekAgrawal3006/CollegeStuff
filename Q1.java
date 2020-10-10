// Abhishek Agrawal
// 20194144
//CSE-A1
//Program to keep record of three employees

import java.util.Scanner;

//class for the fields name, idNumber, department, position
class Employee
{
    String name;
    int idNumber;
    String department;
    String position;

    //constructor that accepts name, id, department and position as arguments
    Employee(String name, int idNumber, String department, String position)
    {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    //constructor that accepts name and id as arguments. department and position are assigned empty string
    Employee(String name, int idNumber)
    {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }

    //no-argument constructor that assigns empty strings to the name, department and position field and 0 to id field
    Employee()
    {}

    //accessor(getter) and mutator(setter) methods for each field
    public String getName()
    {
        return name; 
    }

    public void setName(String name)
    {
        this.name = name;
    }
  
    public int getIdNumber()
    {
        return idNumber; 
    }

    public void setIdNumber(int idNumber)
    {
        this.idNumber = idNumber;
    }

    public String getDepartment()
    {
        return department; 
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public String getPosition()
    {
        return position; 
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    //diaplay the data
    public void display()
    {
        System.out.println(name+" "+idNumber+" "+department+" "+position);
    }
}

class CheckEmployee
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee e2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee e3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        e1.display();
        e2.display();
        e3.display();
    }
}
