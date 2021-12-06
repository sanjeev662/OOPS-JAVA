class Maximum {
    public static void main(String[] args) {
        int x[]={2,3,6,0,5,1,17};
        int max=0;
        for(int i=0;i<x.length;i++)
        {
            if(x[i]>max)
            {
                max=x[i];
            }
        }
        System.out.println(max);
    }
}
