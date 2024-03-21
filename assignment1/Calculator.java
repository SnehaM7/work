package FirstProgram;

import java.util.Scanner;

public class Calculator {
 public static void main(String[] args) {
	 System.out.println("Enter First Number");
	 System.out.println("Enter Second Number");
	 Scanner sc=new Scanner(System.in);
	 int num1=sc.nextInt();
	 int num2=sc.nextInt();
	 System.out.println("Enter Operation you want to perform");
	 System.out.println("Enter 1 for Addition");
	 System.out.println("Enter 2 for Subtraction");
	 System.out.println("Enter 3 for Multiplication");
	 System.out.println("Enter 4 for Division");
	 int choice=sc.nextInt();
	 switch(choice) {
	 case 1:
		 int sum=num1+num2;
		 System.out.println(sum);
		 break;
	 case 2:
		 int sub=num1-num2;
		 System.out.println(sub);
		 break;
	 case 3:
		 int mul=num1*num2;
		 System.out.println(mul);
		 break;
	 case 4:
		 int div=num1/num2;
		 System.out.println(div);
		 break;
	 default:
		 System.out.println("Invalid Input");
	 }
	 sc.close();
}
}