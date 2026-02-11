package Encapsulation;


public class EncapSample {
	private String name;
	private int salary;

	public void setter(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public void getter()
	{
		System.out.println(name);
		int  incentive=1000;
		salary=incentive+salary;
		System.out.println(salary);
	}

}
