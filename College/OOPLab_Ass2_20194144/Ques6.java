import java.util.*;
class Ques6
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks");
        int m=sc.nextInt();
        String c=" ";
        if(m>=85)
        c="A+";
        else if(m<85 && m>=75)
        c="A";
        else if(m<75 && m>=65)
        c="B+";
        else if(m<65 && m>=55)
        c="B";
        else if(m<55 && m>=45)
        c="C";
        else
        c="D";
        System.out.println(c);
    }
}