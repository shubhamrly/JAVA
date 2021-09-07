package hashmap;

import java.util.*;

public class Capital {
HashMap<String, String> hm  = new HashMap<String, String>();
public void show()
{
	for(Map.Entry<String, String> k : hm.entrySet())
	{
		System.out.println(k.getKey() +" "+ k.getValue());
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Capital c = new Capital ();
      c.hm.put("UP", "Lucknow");
      c.hm.put("New Delhi ","New Delhi");
      c.hm.put("MP", "Bhopal");
	c.show();
	}

}
