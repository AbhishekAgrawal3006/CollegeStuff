// Abhishek Agrawal
// 20194144

//Program to store three test scores and display the average

import java.util.Scanner;

//class for the fields score1, score2, score3
class TestScores
{
    int score1;
    int score2;
    int score3;

    //constructor that accepts the three scores as arguments
    TestScores(int score1, int score2, int score3)
    {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    //accessor(getter) and mutator(setter) methods for each field
    public int getScore1()
    {
        return score1; 
    }

    public void setScore1(int score1)
    {
        this.score1 = score1;
    }
  
    public int getScore2()
    {
        return score2; 
    }

    public void setScore2(int score2)
    {
        this.score2 = score2;
    }

    public int getScore3()
    {
        return score3; 
    }

    public void setScore3(int score3)
    {
        this.score3 = score3;
    }

    //getter method to calculate average score
    public double getAverageScore() 
    {
        return (score1 + score2 + score3) / 3;
    }
}

class CheckTestScores
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        TestScores test = new TestScores(0,0,0);
        
        System.out.print("Enter score 1: ");
        test.setScore1(sc.nextInt());
        System.out.print("Enter score 2: ");
        test.setScore2(sc.nextInt());
        System.out.print("Enter score 3: ");
        test.setScore3(sc.nextInt());

        double average = test.getAverageScore();
        System.out.println("The average of the three scores is "+average);
    }
}