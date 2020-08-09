package com.wipro.miniproject;

public class EmployeeDetailsProject {
public static void main(String[] args) {
	String [][]s= {{"1001","Ashish","01/04/2009","e","R&D","2000","8000","3000"},
			{"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
			{"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
			{"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},
			{"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
			{"1006","Suman","01/01/2000","e","Manufacturing","23000","9000","4400"},
             {"1007","Tanmay","12/06/2006","c","PM","2900","12000","10000"}};
	String [][]des= {{"e","Engineer","2000"},
			{"c","Consultant","32000"},
			{"k","Clerk","12000"},
			{"r","Receptionist","15000"},
			{"m","Manager","40000"}};
	int i,a=8,b=0;
	for(i=0;i<7;i++) {
		if(s[i][0].contentEquals(args[0]))
		{
			a=i;
		}
	}
	if(a==8) {
		System.out.println("Ther is no employee  with EmpId : "+args[0]);
	}
	else {
		int Salary=Integer.parseInt(s[a][5])+Integer.parseInt(s[a][6])-Integer.parseInt(s[a][7]);
		for(i=0;i<5;i++) {
			if(s[a][3]==des[i][0]) {
				b=i;
			}
		}
		Salary+=Integer.parseInt(des[b][2]);
		System.out.println("Emp.no  Emp Name  Department  Designation  Salary");
		System.out.println(s[a][0]+"     "+s[a][1]+"      "+s[a][4]+"        "+des[b][1]+"   "+Salary);
	}
}
}
