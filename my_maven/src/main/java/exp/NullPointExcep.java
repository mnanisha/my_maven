package exp;

public class NullPointExcep {

	//static String s=null;
	public void display()
	{
		String s=null;
				try
		{
					System.out.println(s.length());		
		}
				catch(Exception e)
				{
					System.out.println("Exception handled");
					System.out.println(e);
				}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(s.length());
		NullPointExcep n= new NullPointExcep();
		n.display();

	}

}
