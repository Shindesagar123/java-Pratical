package com.sagar;

public class Contracts {
	public int contractsId;
	public String personname;
	public String laborobj;
	public String lorryobj;
	
	
	
	public Contracts() {}
	
	
	public Contracts( int contractsId,String personname,String laborobj,String lorryobj) 
	
	{
		this.contractsId=contractsId;
		this.personname=personname;
		this.laborobj=laborobj;
		this.lorryobj=lorryobj;
		
	
	}


	@Override
	public String toString() {
		return "Contracts [contractsId=" + contractsId + ", personname=" + personname + ", laborobj=" + laborobj
				+ ", lorryobj=" + lorryobj + "]";
	}
	
	
	
	
	

}
