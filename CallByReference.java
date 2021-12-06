public class CallByReference {
    public static void main(String[] args)
    {
            Point p1=new Point();
            p1.x=1;
            p1.y=2;
            System.out.println(p1.x+" "+p1.y);
            
            change(p1);
            System.out.println(p1.x+" "+p1.y);
    }
    static void change(Point p)
    {
        p.x=2;
        p.y=1;
    }
}
class Point
{
    int x,y;
}
