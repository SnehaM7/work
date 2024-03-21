package FirstProgram;
import java.util.Scanner;
public class IfElse {
  public static void main(String args[])
  {
	 System.out.println("Enter Percentages");
	 Scanner sc=new Scanner(System.in);
	 float percentage=sc.nextFloat();
	 if(percentage>=90)
	    System.out.println("Grade A");
	 else if(percentage>=80)
	    System.out.println("Grade B");
	 else if(percentage>=70)
	    System.out.println("Grade C");
	 else if(percentage>=60)
		System.out.println("Grade D");
	 else
		 System.out.println("Fail");
	 sc.close();
  }
}
