// Abhishek Agrawal
// 20194144

//Program to keep record of payroll of employees

import java.util.Scanner;

//class for the fields name, address, age and phone number
class Payroll
{
    String name;
    int idNumber;
    int payRate;
    int workedHours;
    int gross;

    //constructor that accepts name and id as arguments
    Payroll(String name, int idNumber)
    {
        this.name = name;
        this.idNumber = idNumber;  
    }

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

    public int getPayRate()
    {
        return payRate; 
    }

    public void setPayRate(int payRate)
    {
        this.payRate = payRate;
    }

    public int getWorkedHours()
    {
        return workedHours; 
    }

    public void setWorkedHours(int workedHours)
    {
        this.workedHours = workedHours;
    }

    //method to calculate and return gross pay of the employee
    public int getGrosspay()
    {
        gross = workedHours * payRate;
        System.out.println("Gross pay of the above employee is "+gross);
        return gross;
    }
}

class CheckPayroll
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name;
        int idNumber, workedHours, payRate;
        Payroll p = new Payroll("", 0);
        System.out.print("Enter name of employee: ");
        p.setName(sc.nextLine());

        System.out.print("Enter id of employee: ");
        p.setIdNumber(sc.nextInt());

        System.out.print("Enter hourly pay rate of employee: ");
        p.setPayRate(sc.nextInt());

        System.out.print("Enter total hours worked: ");
        p.setWorkedHours(sc.nextInt());
        
        p.getGrosspay();       
    }
}
