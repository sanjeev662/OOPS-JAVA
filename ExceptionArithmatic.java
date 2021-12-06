public class ExceptionArithmatic {
    public static void main(String[] args)
    {
        int a=4;
        int b=0;
        try{
        System.out.println(a/b);
        }
        catch(Exception e)
        {
            System.out.println("We cannot able to do this due to following reson  "+e);
        }
    }
}
