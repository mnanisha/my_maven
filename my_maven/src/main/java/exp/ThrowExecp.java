package exp;

public class ThrowExecp {
public static void display(int age)
{
	if(age<18)
	{
		throw new ArithmeticException("Not Eligible");
	}
	else
	{
		System.out.println("Eligible");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowExecp.display(16);
	}

}
