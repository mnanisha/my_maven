package exp;

public class throwkey {

	public void validnum()
	{
		int a=-10;
		if(a<0)
		{
			throw new ArithmeticException("Invalid");
		}
		else
		{
			System.out.println("Valid");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		throwkey k=new throwkey();
		k.validnum();
	}

}
