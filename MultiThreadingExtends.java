class MyThread1 extends Thread
{
   public void run(){
        int i =0;
        while(i<4){
            System.out.println("Thread1");
            i++;
        }
    }
}

class MyThread2 extends Thread
{
 public void run(){
        try{
        int i =0;
        while(i<4){
            System.out.println("Thread2");
            Thread.sleep(1000);
            i++;
        }
    }
    catch(InterruptedException e)
    {
        System.out.println("Interrupted Exception");
    }
    }
}
public class MultiThreadingExtends {
    public static void main(String[] args) {
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();
    t1.start();
    t2.start();
    }
}
