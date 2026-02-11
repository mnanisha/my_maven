package Inheritence;

public class Childmethod extends Parentmethod {
	public void studentdetails(String name) {
		super.StudentDetails("Anu");
		System.out.println("Name:"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Childmethod c=new Childmethod();
c.studentdetails("Anisha");
	}

}
