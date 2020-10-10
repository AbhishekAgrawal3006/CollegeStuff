// Abhishek Agrawal
// 20194144
// CSE A-1
//Program to keep record personal information

import java.util.Scanner;

//class for the fields name, address, age and phone number
class PersonalInformation
{
    String name;
    String address;
    int age;
    String phone;

    //accessor(getter) and mutator(setter) methods for each field
    public String getName()
    {
        return name; 
    }

    public void setName(String name)
    {
        this.name = name;
    }
  
    public String getAddress()
    {
        return address; 
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getAge()
    {
        return age; 
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getPhone()
    {
        return phone; 
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    //diaplay the data
    public void display()
    {
        System.out.println(name+" "+address+" "+age+" "+phone);
    }
}

class CheckPersonalInfo
{
    public static void main(String[] args) //main function
    {
        PersonalInformation p1 = new PersonalInformation();
        PersonalInformation p2 = new PersonalInformation();
        PersonalInformation p3 = new PersonalInformation();
        p1.setName("Anita");
        p1.setAddress("Delhi");      
        p1.setAge(20);
        p1.setPhone("1234567890");
        p2.setName("Friend");
        p2.setAddress("Bangalore");      
        p2.setAge(22);
        p2.setPhone("5556789020");
        p3.setName("Mother");
        p3.setAddress("Delhi");      
        p3.setAge(47);
        p3.setPhone("5777231009");
        p1.display();
        p2.display();
        p3.display();
    }
}
