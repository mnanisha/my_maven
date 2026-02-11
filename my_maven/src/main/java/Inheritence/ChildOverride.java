package Inheritence;

public class ChildOverride extends ParentOverride{
	@Override
	public void display()
	{
		super.display();
		System.out.println("Iam child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ChildOverride obj=new ChildOverride();
obj.display();

	}

}
