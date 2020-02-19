package InheritanceVersion01;

class present 
{
	int a;
	
	void display()
	{
		System.out.println(a);
		
	}
}

class shild1 extends parent
{
	int x;
	void display()
	{
		System.out.println(y);
	}
}
public  class inheritance{
	public static void main(String[]args) {
		
		present c1=new present();
		c1.a=100;
		c1.x=200;
	c1.display();
	c1.print();
	
	child2 c2=new child2();
	c2.a=100;
	c2.y=20;
	c2.display();

		
	}
}