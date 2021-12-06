class Prime {
    public static void main(String[] args) {
        int n=2;
        for(int i=2;i<=n;i++)
        {
            if(n/i==1)
            {
                System.out.println("prime");
                break;
            }
            else if(n%i==0)
            {
                System.out.println("not prime");
                break;
            }
        }
    }
}
