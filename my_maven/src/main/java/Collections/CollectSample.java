package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ob=new ArrayList();
		ob.add("H|ello");
		ob.add(5);
		ob.add('s');
		ob.add(2.5f);
		System.out.println(ob);
		
		ArrayList <String> obj=new ArrayList();
		obj.add("Hello");
		obj.add("Anisha");
		System.out.println(obj);
		
		ArrayList <String> obj1=new ArrayList();
		obj1.add("Hi");
		obj1.add("Anu");
		System.out.println(obj1);
		obj1.remove(0);
		System.out.println(obj1);
		
		//addall will merge the lists
		obj1.addAll(ob);
		System.out.println(obj1);
		//remove all th elements
		ob.removeAll(ob);
		System.out.println(ob);
		
		//to get the index value
		//obj1.get(0);
		System.out.println(obj1.get(0));
		System.out.println(obj1.size());
		
		//contains-element is present or not
		boolean s=obj1.contains("Anu");
		System.out.println(s);
		boolean s1=obj1.contains("gitu");
		System.out.println(s1);
		
		Iterator it=obj1.iterator();
//it will the print the elements one by one
		while(it.hasNext()) 
		{
		System.out.println(it.next());	
		}
		it.remove();
		System.out.println(obj1);
	}

}
