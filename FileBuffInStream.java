import java.io.*;

public class FileBuffInStream {
    public static void main(String[] args)
    {
        try{
        FileInputStream obj=new FileInputStream("C:\\Users\\sanje\\Desktop\\RANDOM\\Sanjeev.txt");
        BufferedInputStream obj1=new BufferedInputStream(obj);
        int ch;
       while((ch=obj1.read())!=-1)
       {
           System.out.print((char)ch);
       }
        obj1.close();
        obj.close();
    }
    catch(Exception e)
    {
        System.out.println("bhak");
    }
    }
}
