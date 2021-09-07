package hashmap;

import java.util.*;

public class ContactList {
 HashMap<String,Integer> hm = new HashMap<String,Integer> ();
 public void gkey(String n)
 {
	 System.out.println(hm.containsKey(n));
 }
 public void gval(Integer vn)
 {System.out.println(hm.containsValue(vn));
	 //System.out.print();
 }
 public static void main(String[] args)
 {
	 ContactList c =new ContactList();
	 c.hm.put("Shubham", 123);c.hm.put("Shubham1", 1234);c.hm.put("Shubham2", 1235);
	 c.hm.put("Shubham3", 1236);
	 c.gkey("Shubham");c.gval(123);
 }
}
