public class CallByValue 
{
    public static void main(String[] args)
    {
        var x=10;
        change(x);
        System.out.println(x); 
    }
    static void change(int num)
    {
        int y=num+10;
        System.out.println(y);
    }
}
//in callByValue we send a copy of our input varable to methode hence 
// original  value of x not changed i.e 10..and in callByrefrence we send address
//of our input variable hence there are change may occure in our original input..
