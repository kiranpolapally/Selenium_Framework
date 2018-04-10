package collectionsclass_pack;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

public class arraylistsample {
  @Test
  public void f() {
	  
	  
	  ArrayList<Object>  AL = new ArrayList<Object>();

	  //Addition
	  
	  AL.add("jenkins");  //0
	  AL.add(1, "JavaScript");
	  
	  System.out.println(AL.size());
	  
	  System.out.println("Before removing "+AL);
	  
	  
	 /* // removing
	  AL.remove(0);
	  AL.remove("JavaScript");
	  
	  System.out.println("after removing "+AL);
	  System.out.println("after removing"+AL.size());
	 */ 
	  
	  // update
	  
	  AL.set(0, "Dot net");
	  System.out.println("udpated values "+AL);
	  
	  
	  ArrayList<String>  two = new ArrayList<String>();
	  
	  two.add("UFT"); //0 
	  two.add("RFT"); // 1 
	  two.add("SOA");  // 2 
	  two.add("SAP");  // 3 
	  two.add("Dot net");
	  
	  System.out.println(two);
	  
	  //duplicate
	  
	  /*
	  System.out.println("duplicate "+AL.retainAll(two));
	  System.out.println("duplciate value "+AL);
	  */
	  
	  // collections
	  
	  Collections.sort(two);  //asc
	
	  System.out.println(two);
	  
	  for (String str : two) {
	
		  System.out.println("sorted value" +str);
	}
	  
	  
	  Collections.swap(two, 0, 3);
	  System.out.println("after swap "+two);
	  
	  Collections.sort(two,Collections.reverseOrder());
	  

	  
	  
	  
	  
	  
	  
	  
	  ArrayList<String>  demo = new ArrayList<String>();
	  ArrayList<String>  demo2 = new ArrayList<String>();
	  
	  
	  demo.add("benz");
	  demo.add("audi");
	  demo.add("hyndai");
	  demo.add("baleno");
	  
	  demo2.add("benz_2");
	  demo2.add("audi_2");
	  demo2.add("hyndai_2");
	  demo2.add("baleno_2");
	  
	  demo.addAll(demo2);
	  System.out.println(demo);
	  
	  ArrayList<String>  demo3 = new ArrayList<String>();
	  demo3.addAll(demo);
	  demo3.addAll(demo2);
	  
	  System.out.println(demo3);
	  
	  System.out.println(demo3.removeAll(demo3));
	  
	  demo3.clear();
	  demo3.clone();       
	  
	  
  }
}
