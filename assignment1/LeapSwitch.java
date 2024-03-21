package FirstProgram;

import java.util.Scanner;

public class LeapSwitch {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();
	        scanner.close();

	        switch (year % 4) {
	            case 0:
	                if (year % 100 == 0) {
	                    if (year % 400 == 0) {
	                        System.out.println(year + " is a leap year.");
	                    } else {
	                        System.out.println(year + " is not a leap year.");
	                    }
	                } else {
	                    System.out.println(year + " is a leap year.");
	                }
	                break;
	            default:
	                System.out.println(year + " is not a leap year.");
	        }
	    }
	}
