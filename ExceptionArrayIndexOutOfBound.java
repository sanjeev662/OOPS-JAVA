public class ExceptionArrayIndexOutOfBound {
    public static void main(String[] args)
    {
        int arr[]={2,6,10};
        try{
            System.out.println(arr[4]);
        }
        catch(Exception e)
        {
            System.out.println("some error occured "+e);
        }
    }
}
