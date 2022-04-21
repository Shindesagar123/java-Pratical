/*5 WAP to input price and qty and calculate Bill Amount.*/

import java.util.Scanner;

class Program5{

	public static void main(String []args){

		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner (System.in);

		System.out.println("enter your price");
		int a=s1.nextInt();

		System.out.println("Enter your Qty");
		int b =s2.nextInt();


		int bill=a*b;

		System.out.println("Your total bill is" + bill);



    }
}