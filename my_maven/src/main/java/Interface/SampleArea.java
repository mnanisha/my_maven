package Interface;

public class SampleArea implements InterfaceDraw{
public void draw()
{
	System.out.println("Rectangle");
}
public void area()
{
	System.out.println(l*b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleArea a=new SampleArea();
		a.area();
		a.draw();

	}

}
