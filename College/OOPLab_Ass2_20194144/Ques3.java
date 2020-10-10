import java.util.*;
class Ques3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length then breadth");
        float l=sc.nextFloat();
        double b=sc.nextDouble();
        int perimeter=(2*(int)l)+(2*(int)b);
        System.out.println("The perimeter is " + (double)perimeter);
    }
}