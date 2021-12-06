class Multithreading implements Runnable 
{
    public void run()
    { try{
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread1");
            Thread.sleep(2000);
        }
    }
    catch(InterruptedException e)
    {
        System.out.println("It's an Interrupted Exception");
    }
    }
}
class Multithreading2 implements Runnable {
    public void run()
    { try{
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread2");
            Thread.sleep(1000);
        }
    }
    catch(InterruptedException e)
    {
        System.out.println("It's an Interrupted Exception");
    }
    }
}
    public class MultiThreadingImpliment{
    public static void main(String[] args) {
        Multithreading ob=new Multithreading();  //jb object create hota hai tho new born state
        Multithreading2 obj=new Multithreading2();
        Thread t1=new Thread(ob);// runnable state
        Thread t2=new Thread(obj); 
        t1.start();//running state
        t2.start();
    }
}

