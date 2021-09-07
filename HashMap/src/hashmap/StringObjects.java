package hashmap;
import java.util.*;
public class StringObjects {
  HashMap<Integer, String> hm =new HashMap<Integer, String>(); 
  public void Keyite(int gkey)
  {
	  for(Map.Entry<Integer,String> k : hm.entrySet())
	  {
		  int key = k.getKey();
		  if(key==gkey)
		  {
			  System.out.println(key + ": Present");
		  }
	  }
	  
  }
  public void ValIte(String Val)
  {
	  for(Map.Entry<Integer, String > k : hm.entrySet())
	  {
		  String s = k.getValue();
		  if(s.equals(Val))
		  {
			  System.out.println(s + ": Present");
		  }
	  }
	  
  }
  public void loop()
  {
	  for(Map.Entry<Integer, String> k : hm.entrySet())
	  {
		  System.out.println(k.getKey()+ " "+ k.getValue() );
	  }
  }
  public static void main(String [] args)
  {
	  StringObjects s = new StringObjects();
	  s.hm.put(1,"My");s.hm.put(5,"To");
	  s.hm.put(2,"Milkshake");s.hm.put(3,"Bring");s.hm.put(4,"Boys");
	  s.loop();
	  s.Keyite(1);
	  s.ValIte("Milkshake");
	  System.out.println(s.hm.containsKey(2));

	  System.out.println(s.hm.containsValue("Bringq"));
  }
}
