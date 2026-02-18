package exp;

public class ArithExcep {

	public void display()
	{
		int a=10;
		try
		{
		int b=a/0;
		System.out.println(b);
		}
		/*catch(Exception e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}*/
		finally//it will execute in any situation i.e if exception occured or not
		{
			System.out.println("finally block");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithExcep s= new ArithExcep();
		s.display();
	}


	}


