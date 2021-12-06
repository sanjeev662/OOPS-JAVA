class DisplayInput {
    int x;
    int y;
    public static void main(String ar[])
    {
        DisplayInput objects=new DisplayInput();
        objects.input(4,6);
        objects.display();    
    }
    void input(int a,int b)
    {
       x=a;
       y=b;
    }
    void display()
    {
        System.out.println("x="+x+",y="+y);
    }
}
