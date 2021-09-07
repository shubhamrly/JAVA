package Cards;

import java.util.*;

public class Cards {
public static void main(String [] args)
{HashMap<String,ArrayList<Integer>> hs = new HashMap<String,ArrayList<Integer>>();

Scanner  s= new Scanner(System.in);
	 System.out.println("Number Of Card: ");
	int f = s.nextInt(),i=0;
 
	while(i<f)
	{
		System.out.println("Enter Card " +(i+1) );
		String st = s.next();
		s.nextLine();
		int t =s.nextInt();
		if(hs.containsKey(st))
		{
		    
			hs.get(st).add(t);
		}
		else {
			ArrayList<Integer> w = new ArrayList<Integer>();
			w.add(t);
			hs.put(st, w);
		}
		i++;
	}System.out.println("Distint Sysmbols are: ");
	for(Map.Entry<String, ArrayList<Integer>> e : hs.entrySet())
	{
		
		System.out.print(  e.getKey() + "\t");
	}
	System.out.println("");
	for(Map.Entry<String, ArrayList<Integer>> e : hs.entrySet())
	{
		System.out.println(e.getKey());
		System.out.println(e.getValue());
	}
	
	for(Map.Entry<String, ArrayList<Integer>> e : hs.entrySet())
	{
	
		System.out.println("Cards in " + e.getKey()+ " Sysmbol");
		ArrayList<Integer> t   = e.getValue();
	    
		for(int j = 0 ; j < t.size(); j++)
	    {
	    	 System.out.println( e.getKey() +"  "+t.get(j));
	    }
	    
	    System.out.println("Number of cards : "+t.size());
	    int sum = 0;
	    for(int j : e.getValue())
	    {
	    	 sum += j;
	    }
	    System.out.println("Sum of Numbers: "+ sum);
	    
	}
	s.close();
}

}
