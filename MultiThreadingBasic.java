public class MultiThreadingBasic 
{
    public static void main(String[] args)
    {
        thread1 aa=new thread1();
        thread2 bb=new thread2();
        aa.start();
        bb.start();
    }   
}
class thread1 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Sanjeev");
        }

    }
}
class thread2 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Singh");
        }

    }
}