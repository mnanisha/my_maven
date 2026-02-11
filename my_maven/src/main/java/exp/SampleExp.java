package exp;

public class SampleExp {

	public void display()
	{
		int a=10;
		int b=a/0;
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleExp s= new SampleExp();
		s.display();
	}

}
