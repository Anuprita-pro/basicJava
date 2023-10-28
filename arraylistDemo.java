package collection;
import java.util.ArrayList;
import java.util.Iterator;
public class arraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//non generic
		ArrayList list1 = new ArrayList();
		list1.add(101);
		list1.add("riya");
		list1.add(84.6);
		list1.add(null);
		list1.add(101);
		
		System.out.println(list1);
		
		//Generic
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("siya");
		list2.add("diya");	
		list2.add("siya");	
		list2.add("miiya");
		list2.add(null);
			
		System.out.println(list2);
		
		System.out.println("Accesing list element using for each loop");
		for(String string : list2) {
			System.out.print(string+ "");
		}
		System.out.println("Accesing using iterattor");
		Iterator<String> it = list2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+"");	
		}
	
	}

}
