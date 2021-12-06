class Cylinder{
    public static void main(String[] args)
    {
        Shape objects=new Shape();
        objects.input(5,5);
        objects.surface();
        objects.volume();
        objects.display();
    }
    
}
class Shape
{
    int radius,height,r,h;
    double area,vol;
    void input(int radius,int height)
    {
        r=radius;
        h=height;
    }
    void surface()
    {
       area=(2*3.14*r*r)+(2*3.14*r*h); 
    }
    void volume()
    {
        vol=3.14*r*r*h;
    }
    void display()
    {
        System.out.println("Total surface area of cylinder="+ area +"  and volume of cylinder="+vol);
    }
}