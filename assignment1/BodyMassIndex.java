package FirstProgram;
import java.util.Scanner;

public class BodyMassIndex {
  public static void main(String[] args){
	System.out.println("Enter weight");
	System.out.println("Enter height");
	Scanner sc=new Scanner(System.in);
	float weight=sc.nextInt();
	float height=sc.nextInt();
	float bmi=weight/height;
	if(bmi<18.5)
	{
		System.out.println("Underweight");
	}
	if(bmi>=18.5 && bmi<=24.9)
	{
		System.out.println("Normal");
	}
	if(bmi>=25 && bmi<=29.9)
	{
		System.out.println("Overweight");
	}
	if(bmi>=30)
	{
		System.out.println("Obese");
	}
	
	sc.close();
 }
}
