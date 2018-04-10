package collectionsclass_pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void f() {


		String k[] = new String[50];         // limit 50  X

		String m[]  ={"k","xp"};   // 0 1   2 index

		System.out.println(m[1]); //XP


		List<String> Alist = new ArrayList<String>();

		ArrayList<String> kk = new ArrayList<String>();
		
		//add
		kk.add("kiran");          // 0
		kk.add("karthik");     //1 
		kk.add("kishore"); // 2
		
		System.out.println(kk);          // [kiran , karthik , kishore]

		System.out.println(kk.get(1));   


		for (int i = 0; i < kk.size(); i++) {
		
			
			System.out.println(kk.get(i));
		}
		
		
		for (String str : kk) {
			System.out.println("for each value "+str);
		}
		
		
		
		
		
		


		ArrayList<String> two = new ArrayList<String>(


				Arrays.asList("kiran","karthik","kishore"));


		System.out.println(two);


		for (int i = 0; i < two.size(); i++) {

			System.out.println(two.get(i));
		}

		
			
		
		List<Object> n = new ArrayList<Object>();

		n.add("kiran");
		n.add(1);
		n.add(10.21);
		n.add(122222);
		n.add(true);
		
//		
//		size fixed 		size dynamic
//		data type single       multiple datatypes
//		memory waste 		dynamic waste
//		no interfa		    list interfac
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
