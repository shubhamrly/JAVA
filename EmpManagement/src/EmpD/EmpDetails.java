package EmpD;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpDetails {
	
String Fname,Lname,email,add;
long  number;
    public EmpDetails(){}
    public EmpDetails(String Fname,String Lname,String email,String add,long number)
    {
    	this.Fname=Fname;this.Lname=Lname;this.email=email;this.add=add;
    	this.number=number;

    }
    //ArrayList<EmpDetails> arr  =new  ArrayList<EmpDetails>();
    public static void main(String [] args)
    {ArrayList<EmpDetails> arr  =new  ArrayList<EmpDetails>();
    	Scanner s = new Scanner(System.in) ;
    	System.out.println("Enter the Number of Employees");
    	int n = s.nextInt();
    	EmpDetails e []  = new EmpDetails[n];
    	int i =0;
    	while(i<n)
    	{
    		
    		System.out.println("Enter Employee   "+(i+1) + "  Details");
    		System.out.println("Enter the Firstname");
    		//s.nextLine();
    		String fn =s.next(); 
    		
    		System.out.println("Enter the Lastname");
    		//s.nextLine();
    		String ln =s.next();
    		
    		System.out.println("Enter the Mobile");
    		s.nextLine();
    		long m = s.nextLong();
    		System.out.println("Enter the Email");
    		s.nextLine();
    		String em =s.next();
    		System.out.println("Enter the Address");
    		s.nextLine();
    		String a =s.next();
    		e[i]= new EmpDetails(fn,ln,em,a,m); 
    		arr.add(e[i]);
    	   i++;
    	}
    	System.out.format("%-15s %-15s %-15s %-30s %-15s\n","Firstname","Lastname","Mobile","Email","Address");
    	for(EmpDetails f :arr)
    	{
    		
    		System.out.format("%-15s %-15s %-15s %-30s %-15s\n",f.Fname,f.Lname,f.number,f.email,f.add);
    	}
    	s.close();
    }
}
