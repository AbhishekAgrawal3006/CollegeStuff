// Abhishek Agrawal
// 20194144

//Program to keep information about cars and display it

import java.util.Scanner;

//class for the fields yearModel, make, speed
class Car
{
    int yearModel;
    String make;
    int speed;

    //constructor that accepts yearModel and make as arguments assign values to the fields and 0 to speed field
    Car(int yearModel, String make)
    {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }

    //no-arg constructor
    Car()
    {}

    //accessor(getter) methods for each field
    public int getYearModel()
    {
        return yearModel; 
    }
  
    public String getMake()
    {
        return make; 
    }

    public int getSpeed()
    {
        return speed; 
    }

    //accelerate method to add 5 to the speed each time it is called
    int accelerate(int speed)
    {
        speed = speed + 5;
        System.out.println("Speed after accelerating is "+speed);
        return speed;
    }

    //break method to subtract 5 from the speed each time it is called
    int brake(int speed)
    {
        speed = speed - 5;
        System.out.println("Speed after braking is "+speed);
        return speed; 
    }

    //display the data about the car like year model, make and speed
    public void display()
    {
        System.out.println(yearModel+" "+make+" "+speed);
    }
}

class CheckCar
{
    public static void main(String[] args)
    {
        int speed = 160;
        Car c = new Car(1997, "Toyota");
        c.display();
        for(int i = 1; i<=5; i++)
        {
            speed = c.accelerate(speed);
        }
        for(int i = 1; i<=5; i++)
        {
            speed = c.brake(speed);
        }
    }
}
