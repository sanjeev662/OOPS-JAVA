import java.io.FileInputStream;

public class FileInputStreamsString {
    public static void main(String[] args)
    {
try{
    FileInputStream inp=new FileInputStream("C:\\Users\\sanje\\Desktop\\RANDOM\\Sanjeev.txt");
    int i=0;
    while((i=inp.read())!=-1)
    {
        System.out.print((char)i);
    }
    inp.close();
}
catch(Exception e)
{
    System.out.println(e);
}
}  
}  

