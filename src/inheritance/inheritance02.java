package inheritance;//Child and parent concept
class A
int a;
void display()
{
	System.out.println(a);
}

	class B extends A
	{
		int b;
		void print()
	}
	{
		
	System.out.println(b);
	}
	}
	class C extends B
	{
		int c;
		void show()
		{
			System.out.println(c);
		}
	}
public class inheritance02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C cj=new C();
cj.a=10;
cj.b=20;
cj.c=30;
cj.display();
cj.print();
cj.show();



	}

}
}
