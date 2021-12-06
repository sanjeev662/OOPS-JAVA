class Factorial{
    public static void main(String args[])
    {    
     myfact call=new myfact();
     int result=call.fact(4); 
     System.out.println("Factorial is: "+result);    
    } 
}
class myfact
{   
  int fact(int n)
  {    
    if (n==1) 
    {
      return (1);
    }
    else
    {    
      return(n*fact(n-1));    
    }
 }  
}