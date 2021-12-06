class Mathematics
{
	int s,n,a,b;
	void input(int s)
	{
		n=s;
	}

	void square()
	{
		a=n*n;
	}
	void cube()
	{
		b=n*n*n;
	}
	void display()
	{
		System.out.print("square="+a+",cube="+b);
	}
}
class Airthmatics
{
	public static void main(String[] args)
	{
		Mathematics cal=new Mathematics();
		cal.input(3);
		cal.square();
		cal.cube();
		cal.display();
	}
}