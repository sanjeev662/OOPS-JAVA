class Box {
    public static void main(String[] args)
    {
        volSur objects=new volSur();
        objects.input(4,6,2);
        objects.surface();
        objects.volume();
        objects.display();
    }
    
}
class volSur
{
    int l,b,h,area,vol;
    public void input(int length,int width,int height)
    {
        l=length;
        b=width;
        h=height;
    }
    void surface()
    {
       area=(2*(l+b)*h)+(l*b);
    }
    void volume()
    {
        vol=l*b*h;
    }
    public void display()
    {
        System.out.println("Total surface area of box="+ area +"  and volume of box="+vol);
    }
}