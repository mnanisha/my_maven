package accessmodifier;

public class AccessSample1 {
	public int a=10;
	private String b="Hello";
	protected char c='c';
	float f=10f;
	
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AccessSample1 s1=new AccessSample1();
s1.display();
	}

}
