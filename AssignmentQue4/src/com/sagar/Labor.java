package com.sagar;

public class Labor {
	
	public String laborname;
	public int age;
	public String town;
	public int contactno;
	
	
	public Labor() {}
	
	
	public Labor (String laborname, int age,String town ,int contactno)
	{
		
		this.laborname=laborname;
		this.age=age;
		this.town=town;
		this.contactno=contactno;
	
		
	}


	@Override
	public String toString() {
		return "Labor [laborname=" + laborname + ", age=" + age + ", town=" + town + ", contactno=" + contactno + "]";
	}
	
	
	
	
	
	

}
