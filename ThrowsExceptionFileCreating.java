import java.io.File;

public class ThrowsExceptionFileCreating {
    public static void main(String[] args) throws Exception
    {
        File myFile=new File("Sanjeev.txt");
            myFile.createNewFile();
            System.out.println("File created successfully with using throws Exception..at the place of try catch block");
    }
}