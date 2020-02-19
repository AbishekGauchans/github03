package inheritance;
class a //parent class
{
	int a;
	void display()
	{
		System.out.println(a);
		
	}
}
class b extends A//B is class, A is parent class
int b ;
void print()
{
	System.out.println(b);
	
}

public class inheritance01 {

	public static void main(String[] args) {
		a aj=new a();
		aj.a=100;
	
		aj.display();
		
		b bj=new b();
		bj.b=200;
		bj.b=200;
		bj.display();
		bj.print();
		
		
		
	}

}
}