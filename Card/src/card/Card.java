package card;
import java.util.*;
public class Card {
 String cd ;
 Integer sy ;
	public static void main(String [] args)
{
	//ashSet<String,Integer>hs = new HashSet<String,Integer>();
	Card c []  = new Card [4];
	c[0]= new Card();c[1]= new Card();c[2]= new Card();c[3]= new Card();
		HashSet<Card> ss = new HashSet<Card>();
	Scanner s = new Scanner(System.in);
	boolean ac = false,bc =  false, cc = false,dc = false;
	while((ac == false) ||(bc == false) ||(cc == false) ||(dc == false))
	{
		System.out.println("Enter card:");
		String nc = s.next();
		System.out.println("Enter Symbol");
		Integer  i = s.nextInt();
		if(nc.equals("a") && (ac == false))
		{
			  c[0].cd = nc;
			  c[0].sy = i;
			  
			  ss.add(c[0]);
		      ac = true;
		}
		if(nc.equals("b") && (bc == false))
		{
			  c[1].cd = nc;
			  c[1].sy = i;
			  ss.add(c[1]);
		      bc = true;
		}
		if(nc.equals("c") && (cc == false))
		{
			  c[2].cd = nc;
			  c[2].sy = i;
			  ss.add(c[2]);
		      cc = true;
		}
		if(nc.equals("d") && (dc == false))
		{
			  c[3].cd = nc;
			  c[3].sy = i;
			  ss.add(c[3]);
		      dc = true;
		}
	}
	//Iterator it = ss.iterator();
	
	//for(Card cf : ss)
	//{
		System.out.println(c[0].cd +" " + c[0].sy);
		System.out.println(c[1].cd +" " + c[1].sy);
		System.out.println(c[2].cd +" " + c[2].sy);
		System.out.println(c[3].cd +" " + c[3].sy);
		
	//}
	s.close();
}
}
