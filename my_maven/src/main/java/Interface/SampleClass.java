package Interface;

public class SampleClass implements Interfacesample {
public void print()
{
	System.out.println("Method of class");
}
public void add()
{
	System.out.println(a+b);
}
public void dispaly()
{
	System.out.println("Method in interface");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SampleClass s=new SampleClass();
		s.print();
		s.add();
		s.dispaly();*/
		Interfacesample i=new SampleClass();
		i.add();
		i.dispaly();
		System.out.println(i.b);

	}

}
