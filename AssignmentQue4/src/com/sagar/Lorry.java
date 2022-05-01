package com.sagar;

public class Lorry {
	public String lorryname;
	public int vehiclenumber;
	public float waightofgoods;
	
	
	
	
	public Lorry() {}
	
	
	public Lorry(String lorryname,int vehiclenumber,float waightofgoods) 
	{
		this.lorryname=lorryname;
		this.vehiclenumber=vehiclenumber;
		this.waightofgoods=waightofgoods;
		
		
	}


	@Override
	public String toString() {
		return "Lorry [lorryname=" + lorryname + ", vehiclenumber=" + vehiclenumber + ", waightofgoods=" + waightofgoods
				+ "]";
	}
	
	
	

	
}
