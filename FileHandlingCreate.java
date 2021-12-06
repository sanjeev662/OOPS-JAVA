import java.io.File;
import java.io.IOException;

public class FileHandlingCreate {
    public static void main(String[] args)
    {
        File myFile=new File("Sanjeev.txt");
        try
        {
            myFile.createNewFile();
            System.out.println("File created successfully");
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}