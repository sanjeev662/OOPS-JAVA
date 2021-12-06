class Employee {
    public static void main(String[] args) {
   Detail sr=new Detail();
   Detail sr1=new Detail();
   sr.input("Sanjeev","EO",121,20);
   sr1.input("Maurya Ji","ECO",122,21);
   sr.display();
   sr1.display();
}
}
class Detail
{
    String s,n;
    int num,ex;
    void input(String name,String designation,int idnumber,int experience)
    {
        s=name;
        n=designation;
        num=idnumber;
        ex=experience;
    }
    void display()
    {
        System.out.println("Employee name = "+s+" ,Designation name = "+n+" ,ID number = "+num+" ,Experience = "+ex);
    }
}