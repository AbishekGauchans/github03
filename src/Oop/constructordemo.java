package Oop;

public class constructordemo {
	// default constructor
	int x;
	int y;
	
	constructordemo() 
	//define value on centric classss in default constructor
	
	{
		x=10;
		y=20;
		
	}
	void display()
	{
		System.out.println(x+y);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructordemo c1=new constructordemo();
		//execute class
		
		c1.display();
		
		
		
		
		

	}

}
