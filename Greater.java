class Greater {
    public static void main(String[] args)
    {
        int a,b,c;
        a=5;
        b=4;
        c=9;
        if(a>c)
        {
            if(a>b)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(b);
            }
        }
        else
        {
            if(c>b)
            {
                System.out.println(c);
            }
            else
            {
                System.out.println(b);
            }
        }
    }
}
