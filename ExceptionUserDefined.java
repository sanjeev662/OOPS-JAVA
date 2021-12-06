//import java.io.*;


class MyInvalidNumberException extends Exception
{
    void ShowDetail()
    {
        System.out.println("Negative numbers are not valid");
    }
}

public class ExceptionUserDefined {
    public static void main(String[] args)
    {
        int marks=28;
        try{
            if(marks<0)
            {
                MyInvalidNumberException ex=new MyInvalidNumberException();
                throw(ex);
            }
            else
            System.out.println(marks);
        }
        catch(MyInvalidNumberException e)
        {
            e.ShowDetail();
        }
        System.out.println("Completed");
    }
}