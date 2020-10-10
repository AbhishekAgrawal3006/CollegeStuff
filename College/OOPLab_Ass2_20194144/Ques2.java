import java.io.*;
import java.util.*;
class Ques2
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name="Abhishek Agrawal";
        String fname="Mr Diwakar Agrawal";
        int dobd=30; int dobm=6; int doby=2000;
        System.out.println("Enter today's date in DD/MM/YY format");
        String date=br.readLine();
        StringTokenizer st=new StringTokenizer(date,"/");
        int days=30 + 6*30;
        int datedays=Integer.parseInt(st.nextToken());
        datedays+=Integer.parseInt(st.nextToken())*30;
        datedays+=Integer.parseInt(st.nextToken())*365;
        int diff= datedays-days;
        int agey=diff/365;
        int agem=(diff-(agey*365))/30;
        int aged=diff- (agey*365) - (agem*30);
        System.out.println("Student name: " + name + "\nFather's name: " + fname + "\nAge: " + agey + "years " + agem + "months " + aged + "days ");
            
    }
}