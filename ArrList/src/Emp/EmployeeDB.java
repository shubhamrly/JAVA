package Emp;

import java.util.*;

public class EmployeeDB extends EmpMang {
static Vector <EmpMang> list = new Vector<EmpMang>();
Iterator<EmpMang> i = list.iterator();
boolean addEmployee(EmpMang e) {
	//System.out.print(false);
	e.GetEmployeeDetails();
	list.add(e);
	return true;
}
boolean deleteEmployee(int empId)
{
	System.out.println("Deleting:"+empId);
	list.removeIf(e->e.empId == empId);
	
	
	return true;
}
String showPaySlip(int gempId)
{ 
	String s="";
	for(EmpMang e :list)
	{
		if(e.empId==gempId)
		{
			s=e.email+e.salary;
		}
		
	}
	
	return s;
	
}
public static void main(String [] args)
{
	EmployeeDB ee = new EmployeeDB();
	EmpMang e[] = new EmpMang[3];
	 e[0] = new EmpMang();
	 e[1] = new EmpMang();
	 e[2] = new EmpMang();
	e[0].email="Name@gmail.com";
	e[0].empId=100;
	e[0].empName="Name";
	e[0].gender="NO";
	e[0].salary=100;
	ee.addEmployee(e[0]);
	e[1].email="Name1@gmail.com";
	e[1].empId=101;
	e[1].empName="Name1";
	e[1].gender="NO";
	e[1].salary=1000;
	ee.addEmployee(e[1]);
	e[2].email="Name2@gmail.com";
	e[2].empId=102;
	e[2].empName="Name12";
	e[2].gender="NO";
	e[2].salary=10000;
	ee.addEmployee(e[2]);
	System.out.println(ee.showPaySlip(100));
	ee.deleteEmployee(100);

	System.out.println(ee.showPaySlip(101));
	ee.deleteEmployee(101);

	System.out.println(ee.showPaySlip(102));
	ee.deleteEmployee(102);
	
	System.out.println(ee.showPaySlip(101));

}}
