import java.io.*;

public class FileBuffOutStream {
    public static void main(String[] args)
    {
        try{
        FileOutputStream obj=new FileOutputStream("C:\\Users\\sanje\\Desktop\\RANDOM\\Sanjeev.txt");
        BufferedOutputStream obj1=new BufferedOutputStream(obj);
        String s="LE AB SAMAJHNE LAGA HUN TUJHE BHI";
        byte b[]=s.getBytes();
        obj1.write(b);
        obj1.close();
        obj.close();
        }
        catch(Exception e)
        {
            System.out.println("Bhak");
        }
    }
}
