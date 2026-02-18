package exp;

public class SalaryExecp {

	public void salaryex(int salary) throws SalaryExcep
	{
		if(salary<=10000) {
			throw new SalaryExcep("Not Eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
	}
	public static void main(String[] args) throws SalaryExcep {
		// TODO Auto-generated method stub
		SalaryExecp e= new SalaryExecp();
		e.salaryex(9000);

	}

}
