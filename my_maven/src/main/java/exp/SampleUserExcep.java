package exp;

public class SampleUserExcep {
	public void test(int age) throws LicenseException
	{
		
		if(age<=18)
		{
			throw new LicenseException("Not eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) throws LicenseException {
		// TODO Auto-generated method stub
		SampleUserExcep e= new SampleUserExcep();
		e.test(10);
		

	}

}
