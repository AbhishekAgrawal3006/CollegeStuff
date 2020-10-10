import java.util.*;
class Ques4
{
    static boolean checkPrime(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(n%i==0 && i!=n)
            return false;
        }
        return true;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        for(int i=0;i<5;i++)
        {
            int n=sc.nextInt();
            if(checkPrime(n))
            System.out.println("Prime");
            else
            System.out.println("Not Prime");
        }
    }
}