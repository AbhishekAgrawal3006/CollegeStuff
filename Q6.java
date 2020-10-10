// Abhishek Agrawal
// 20194144
//CSE A1
//Program to demostrate Circle class and reporting the circle's area, diameter and circumference

import java.util.Scanner;

//class for the fields radius, PI
class Circle
{
    double radius;
    final double PI = 3.14159;

    //constructor that accepts radius as arguments
    Circle(double radius)
    {
        this.radius = radius;
    }

    //no-arg constructor that sets radius field to 0.0
    Circle()
    {
        this.radius = 0.0;
    }

    //accessor(getter) and mutator(setter) methods for radius field
    public double getRadius()
    {
        return radius; 
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
  
    //returns the area of circle
    public double getArea()
    {
        return PI * radius * radius; 
    }

    //returns diameter of circle
    public double getDiameter()
    {
        return 2 * radius; 
    }

    //returns circumference of circle
    public double getCircumference()
    {
        return 2 * PI * radius; 
    }
}

class CheckCircle
{
    public static void main(String[] args) // Main function
    {
        Scanner sc = new Scanner(System.in);
        double radius;
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();

        Circle c = new Circle(radius);
        c.setRadius(radius);

        System.out.println("Circumference of the circle is "+c.getCircumference());
        System.out.println("Diameter of the circle is "+c.getDiameter());
        System.out.println("Area of the circle is "+c.getArea());
    }
}
