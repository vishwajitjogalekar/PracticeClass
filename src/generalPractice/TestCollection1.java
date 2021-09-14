package generalPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection1 {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("vishwajit");
		al.add("devdatta");
		al.add("Ram");
		al.add("Sham");
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
