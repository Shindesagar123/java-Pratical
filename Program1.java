/*WAP to input width and height of a rectangle and calculate the area and perimeter.
[Area of rectangle: width*height, Perimeter of rectangle: 2*width+2*height]
 */

 import java.util.Scanner;

 class Program1{

	 public static void main(String []args){

		Scanner s1 =new Scanner(System.in);
		Scanner s2=new Scanner(System.in);

		System.out.println("Enter the height ");
		int a = s1.nextInt();

		System.out.println("Enter the width");
		int b = s2.nextInt();

		int area = a*b;

		System.out.println("Area of Rectangle "+area);

		int Perimeter = 2*a+2*b;

		System.out.println("Perimeter is Rectangle is " + Perimeter);



		 }

	 }