package JumpingStatements;

public class JumpingStatement01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int a=1; a<=10; a++)
			//
		{
			if (a==7)//anything before this condition after break always!!
			{
		//Break need seprate Bracket. it will break before 7. 
		// Identity management if password fails or false=breaks
				break; 
			}
		System.out.println(a);
	}
		

	}

}
