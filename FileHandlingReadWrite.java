import java.io.File;   //for creating
import java.io.FileWriter;  //for writing
import java.util.Scanner;   //for reading
import java.io.IOException;   //for create,write exception
import java.io.FileNotFoundException;  //for read exception



public class FileHandlingReadWrite {
    public static void main(String[] args) 
    {
        File myFile=new File("C:\\Users\\sanje\\Sanjeev1.txt");
        try{
            
            myFile.createNewFile();
            System.out.println("File created succesfully Now we can write");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
      //writing
      try{
        FileWriter myFileO=new FileWriter("C:\\Users\\sanje\\Sanjeev1.txt");
        myFileO.write("I am writing now using methods write");
        myFileO.close();
       }
       catch(IOException e)
        {
            System.out.println(e);
        }

       //read
       try{
       Scanner sc=new Scanner(myFile);
       while(sc.hasNextLine())
        {
            String s=sc.nextLine();
            System.out.println(s);
        }
        sc.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
}
