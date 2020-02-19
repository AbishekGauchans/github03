package thiskeyword;

public class thiskeyword01 {

	
		//This is use for trying to bulid Code
	
		
		int a,b;//Instance Variable
		
		
		void getvalues (int a, int b)//Method variable
		{
			this.a=a;//Particular key we use this 
			this.b=b;
			
	 		
		}
		
		void printvalues()
		{
			System.out.println(a);
			
			System.out.println(b);
		}
		
		
		public static void main(String[] args) {
		thiskeyword01 key= new thiskeyword01();
		key.getvalues(10,200);
		key.printvalues();
		

	}

}
