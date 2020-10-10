import java.util.Scanner;

public class Ques5 {
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static int lcm(int n1, int n2) {
        int max;
        max = (n1 > n2) ? n1 : n2;

        do
        {
            if (max % n1 == 0 && max % n2 == 0)
            {
                return max;
            }
            else
                ++max;
        } while (true);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 integers: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt(), n4 = sc.nextInt(), n5 = sc.nextInt();
        System.out.println("GCD of numbers is: " + gcd(gcd(n1, gcd(n2, gcd(n3, n4))), n5));
        System.out.println("LCM of numbers is: "+ lcm(lcm(n1, lcm(n2, lcm(n3, n4))), n5));
    }
}