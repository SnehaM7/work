package FirstProgram;
import java.util.Scanner;
public class IsVolwel {
 public static void main(String[] args) {
    System.out.println("Enter any character");
    Scanner sc=new Scanner(System.in);
    char c=sc.next().charAt(0);
    if((c>='0'&& c<='9'))
    {
    	System.out.println("Invalid input");
    }
    else if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
    	System.out.println("Character is vowel");
    else
    	System.out.println("Character is consonant");
    sc.close();
}
}
