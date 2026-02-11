package Encapsulation;

public class Encapsulesample {
	private int studentmarks;
	private int rollno;
	private String name;
	/*public void display(String name,int rollno,int studentmarks)
	{
		int bonusmarks=100;
		studentmarks=studentmarks+bonusmarks;
		System.out.println("Name:" +name);
		System.out.println("Rollno :"+rollno);
		System.out.println("Marks :"+studentmarks);
	}*/
	public void setter(String name,int rollno,int studentmarks)
	{
		this.name=name;
		this.rollno=rollno;
		this.studentmarks=studentmarks;
	}
	public void getter()
	{
		int bonusmarks=100; 
		studentmarks=studentmarks+bonusmarks;
		System.out.println("Name:" +name);
		System.out.println("Rollno :"+rollno);
		
		System.out.println("Marks :"+studentmarks);
	}

}
