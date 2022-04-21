/*3WAP to input inches from the user and convert it into yards, feet.
[Inch=inch*0.027 yards, inch=0.083 feet]*/


 import java.util.Scanner;

 class Program3{

	 public static void main(String []args){

		 Scanner s1= new Scanner(System.in);

		 System.out.println("Enter the Inch");
		 double a=s1.nextDouble();

		  double yards=a*0.027;

		  System.out.println("Total yards " + yards);

		  double feet =a/12;
		  System.out.println("Total feet" + feet);









		 }








	 }