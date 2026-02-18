package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ob=new ArrayList();
		ob.add("Green");
		ob.add('g');
		ob.add(5);
		ob.add(11.34f);
		System.out.println(ob);
		
		List<String> ob1=new ArrayList();
		ob1.add("Red");
		ob1.add("ring");
		ob1.add("beautifull");
		System.out.println(ob1);
		ob1.remove(2);
		System.out.println(ob1);
		
		ob.addAll(ob1);
		System.out.println(ob);
		ob.removeAll(ob1);
		System.out.println(ob);
		
System.out.println(ob.get(0));
System.out.println(ob.size());
System.out.println(ob);
//boolean b=ob.contains("green");
boolean b=ob.contains('g');
System.out.println(b);

boolean b2=ob.contains("Green");
System.out.println(b2);

boolean b1=ob.contains("red");
System.out.println(b1);

Iterator it=ob.iterator();
//it will the print the elements one by one
		while(it.hasNext()) 
		{
		System.out.println(it.next());	
		}
		it.remove();
		System.out.println(ob);
	}

}
