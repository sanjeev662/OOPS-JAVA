public class ExceptionAll {
    public static void main(String[] args) {
        int marks[]={3,6,8};
        int ind=2;
        int number =0;
        try
        {
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value of array-value/number is: " + marks[ind]/number);
        }
       catch (ArithmeticException e){
            System.out.println("ArithmeticException occured!");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
        }
        catch (Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }
    }
}
