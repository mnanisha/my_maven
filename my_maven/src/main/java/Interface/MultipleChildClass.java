package Interface;

public class MultipleChildClass implements InterParent1, Interparent2 {
public void show()
{
	System.out.println("method of child class");
}
public void display()
{
	System.out.println(a+b);
}
public void print()
{
	System.out.println("parent2");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleChildClass obj=new MultipleChildClass();
		obj.display();
		obj.print();
		obj.show();
	}

}
