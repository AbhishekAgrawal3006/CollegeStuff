import java.util.*;
class Ques7
{
public static void main(String[] args)
{
int av;
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks");
av=sc.nextInt();
switch (av/10)
{
case 9:
System.out.println("Grade is A+");
break;
case 8:
System.out.println("Grade is A");
break;
case 7:
System.out.println("Grade is B");
break;
case 6:
System.out.println("Grade is C");
break;
case 5:
System.out.println("Grade is D");
break;
case 4:
System.out.println("Grade is E");
break;
default:
System.out.println("Grade is Fail");
break;
}
}
}