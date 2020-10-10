// Abhishek Agrawal
// 20194144

//Program to demostrate MonthDays class and display number of days in a month

import java.util.Scanner;

//class for the fields radius, PI
class MonthDays
{
    int month;
    int year;

    //constructor that accepts integer month and year as arguments
    MonthDays(int month, int year)
    {
        this.month = month;
        this.year = year;
    }
  
    //accessor(getter) method to return number of days for a specified month
    public int getNumberOfDays()
    {
        switch(month){
            case 1,3,5,7,8,10,12: return 31;
                                  
            case 2: if((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))
                        return 29;
                    else return 28;
                    
            case 4,6,9,11: return 30;
                           
            default: System.out.println("Wrong value entered!");
                     return -1;
        } 
    }
}

class CheckMonthDays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int month, year;
        System.out.print("Enter an integer for month(1-12): ");
        month = sc.nextInt();
        System.out.print("Enter an integer for year: ");
        year = sc.nextInt();

        MonthDays m = new MonthDays(month, year);
        
        System.out.println("Number of days = "+m.getNumberOfDays());
    }
}
