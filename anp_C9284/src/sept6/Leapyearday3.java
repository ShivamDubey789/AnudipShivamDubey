package sept6;

import java.util.*;

public class Leapyearday3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
			System.out.println("Enter a year: ");
		
		int year = scanner.nextInt();
		
		scanner.close();
		
		if(year % 4 ==0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					
					System.out.println(year + " is a leap year");
				}else{
					System.out.println(year + " is not leap year");
				}
			}else {
			
				System.out.println(year + " is a leap year");
			}
		}else {
			
			System.out.println(year + " is not a leap year");
			}
		}	
	
	
}
