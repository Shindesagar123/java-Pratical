package com.sagar;

public class Mainclass {

	public static void main(String[] args) {
		
		Labor l1 []=new Labor[5];
		
		l1 [0] = new Labor("shubham",22,"sangli",89764532);
		l1 [1] =new Labor("Raj",22,"Miraj",98675432);
		l1 [2] =new Labor("Rahul",22,"palus",98675432);
		l1 [3] =new Labor("Ram",22,"kolhapur",87658954);
		l1 [4] =new Labor();
		
		for(Object item:l1) {
			
			
			System.out.println(item);
		}
		
		
		
	Lorry s1[]=new Lorry[3];
	
	s1 [0]=new Lorry("maruti",7645,76.00f);
	s1[1]=new Lorry("gfhfy",6453,88.00f);
	s1[2]=new Lorry("yfgyg",4321,54.00f);
	
	
	
	for(Object item:s1 ) {
		
		
		System.out.println(item);
		
	}
	
	
	
Contracts c1[]=new Contracts[6];
	
	c1[0]=new Contracts(54,"raju","hdj","hsdhs");
	c1[1]=new Contracts(54,"rahul","hdj","hsdhs");
	c1[2]=new Contracts(54,"ram","hdj","hsdhs");
	c1[3]=new Contracts(54,"shubham","hdj","hsdhs");
	c1[4]=new Contracts(54,"sam","hdj","hsdhs");
	c1[5]=new Contracts(54,"ajay","hdj","hsdhs");
	
	
	for(Object item:c1) {
		
		System.out.println(item);
	}
	
	

	}
}