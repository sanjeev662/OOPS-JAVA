import java.io.FileOutputStream;

public class FileOutputStreamString {
  public static void main(String[] args)
  {
    try{
        FileOutputStream obj=new FileOutputStream("C:\\Users\\sanje\\Desktop\\RANDOM\\Sanjeev.txt");
        String s="I am writing now";
        byte b[]=s.getBytes();
        obj.write(b);
        obj.close();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
