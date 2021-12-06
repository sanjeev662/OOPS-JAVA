abstract class parent1 
{
     void print1()
     {
         System.out.println("I m abstract parent class");
     }
     void print2()
     {
         System.out.println("U can't creat my object");
     }
}
class child extends parent1
{
    void print1()
    {
        System.out.println("Overriding makes child class safe from being extract class");
    }
}
class Abstracts
{
    public static void main(String[] args)
    {
        child ch=new child();
        ch.print1();
        continue
    }
}

