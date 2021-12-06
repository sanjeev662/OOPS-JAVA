class CountSpecial {
        public static void main(String ar[])
        {
            char ch[]={'b','d','&','c','1','['};
            int z,count=0;
            for(int i=0;i<ch.length;i++)
            {
                z=(int)ch[i];
                if((z<48) || (z>57 && z<65) || (z>90 && z<97) || (z>122))
                {
                    count++;
                }
            }
        System.out.println("no of special character = " +count);
        }
    }   
    
