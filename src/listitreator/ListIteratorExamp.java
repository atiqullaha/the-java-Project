package listitreator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExamp {



	public static void main(String[] args) {
		
		ArrayList<String>list=new ArrayList<String>();
		list.add("computer");
		list.add("processer");
		list.add("keyboard");
		list.add("mouse");
		list.add("Screen");
//		Normal iterator List Reading forward
		System.out.println("This is normal ");
		ListIterator i=list.listIterator();
		while(i.hasNext()){
			String s=(String)i.next();
			System.out.println(s);
			
		}
//		Backward Reading
		System.out.println("this is the provious data");
		while(i.hasPrevious()){
			String s=(String )i.previous();
			System.out.println(s);
		}
		
	}

}
