package demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class MyJava extends Date{

	  
	public static void main(String[] args) {
		Collection coll=new HashSet();
				coll.add("1");
				coll.add("1");
				System.out.println(coll.size());
				for(Object o:coll){
					System.out.println(o);
				}
	}
}
