package Capital;

import java.util.*;

public class CountryCap {
	
		 HashMap<String,String> hm = new HashMap<String,String> ();
		 HashMap<String,String> hm1 = new HashMap<String,String> ();
		 ArrayList<String> arr= new ArrayList<String> ();
		 //HashMap<HashMap<String,String>,String> nhm= new HashMap<HashMap<String,String>,String>();
		 public void SaveCountry(String c,String cc)
		 {
			 hm.put(c,cc);
		 }
		 public void getCountry(String c)
		 {
			 for(Map.Entry<String,String> k  : hm.entrySet())
			 { 
				String key = k.getValue();
				 if(key.equals(c))
				 {
					 System.out.println(k.getKey());
				 }
			 }
		 }
		 public void getCapital(String c)
		 {
			 for(Map.Entry<String,String> k  : hm.entrySet())
			 { 
				String key = k.getKey();
				 if(key.equals(c))
				 {
					 System.out.println(k.getValue());
				 }
			 }
		 }
		 public void getRev()
		 {
			 for(Map.Entry<String,String> k  : hm.entrySet())
			 { 
				String val = k.getValue();
				 String key = k.getKey();
				 hm1.put(val,key );
			 }
		 }
		 public void toList()
		 {
			 for(Map.Entry<String,String> k  : hm.entrySet())
			 { 
				 String key = k.getKey();
				 arr.add(key);
			 }
		 }
		 public static void main(String [] args )
		 {
			 CountryCap c = new CountryCap();
			 c.SaveCountry("India", "Delhi");
			 c.SaveCountry("Japan", "Tokyo");
			 System.out.println(c.hm.getOrDefault("Indiana", "NOT FOUND"));
			 
			 System.out.println(c.hm);
			 c.getRev();
			 System.out.println(c.hm1);
			 c.getCapital("India");
			 c.getCountry("Delhi");
			 c.toList();
			 for(String k : c.arr)
			 {
				 System.out.println(k);
			 }
		 }
}
