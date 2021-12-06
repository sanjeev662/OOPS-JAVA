import java.io.*;
class FileHandlingCopy
{
    public static void main(String arg[])throws IOException
    {
       FileInputStream fis=new FileInputStream("C:\\Users\\sanje\\Desktop\\RANDOM\\Sanjeev.txt");
       String s="saaaaaa nn";
       int i=fis.read();
       while(i!=-1)
       {
           s+=(char)i;
           i=fis.read();
       }        
       FileWriter fos=new FileWriter("C:\\Users\\sanje\\Desktop\\RANDOM\\Sanjeev1.txt",true);
       fos.write(s);
       fos.close();
       fis.close();
    }
}