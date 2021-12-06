//my code

import java.util.*;
public class MyDetail {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your ID..");
        int id=sc.nextInt();
        if(id==179)
        {
            System.out.println("Enter your pin code..");
            int pin=sc.nextInt();
            if(pin==9211)
            {
                System.out.println("To know your detail...press given no.(like 1,2 etc)");
                System.out.println("1.General intro");
                System.out.println("2.College detail");
                System.out.println("3.School detail");
                System.out.println("4.Family detail");
                int number=sc.nextInt();
                switch (number)
                {
                    case 1:
                    intro num1=new intro();
                    num1.detail();
                    break;
                    case 2:
                    college num2=new college();
                    num2.detail();
                    num2.collegeDetail();
                    break;
                    case 3:
                    school num3=new school();
                    num3.detail();
                    num3.schoolDetail();
                    break;
                    case 4:
                    you num4=new you();
                    num4.mom();
                    break;
                }
            } 
        }
        else
        System.out.println("ID yet not registerd..");
    }
}

//for inheritence

class intro
{
    void detail()
    {
        System.out.println("u r naam ka student");
    }
}
class college extends intro
{
    void collegeDetail()
    {
    System.out.println("u r student of uiet..it's truth.");
    }
}
class school extends intro
{
    void schoolDetail()
    {
    System.out.println("u have done your schooling from ballia #NagaJi...");
    } 
}

//for Abstract

abstract class parents
{
     void mom()
     {
         System.out.println("u called your mother mummy ji...");
     }
     void di()
     {
         System.out.println("U respect your di..Which may be true..");
     }
}
class you extends parents
{   
    //Overriding makes child class safe from being extract class..
    void mom()
    {
        System.out.println("u called your mother mom..jyada khush na ho..code khol kar dekho...");
    }
}