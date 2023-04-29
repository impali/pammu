package ifelseQ4;

public class leapyear {

	public static void main(String[] args) {
		System.out.println("using if else only******");
		love.dimpi(2024);
		love.dimpi(2023);
		System.out.println("using nested-if only******");
Pramod.pammu(2056);
love.dimpi(2024);
love.dimpi(2023);
	}

}
 class love{

	public static void dimpi(int yr) {
		
		if(yr % 4==0 && yr % 100!=0 || yr % 400==0) {
			
			System.out.println(yr +" is leap year");
		
		}
		else {
			System.out.println(yr +" is not leap year");
		}
		

	}

}
 class Pramod{

		public static void pammu(int year) {
			
			if(year % 4==0) {
				if(year % 100==0) {
					if(year % 400==0) {
						System.out.println(year +" is a leap year");
					}
					else {
						System.out.println(year +" is not a leap year");
					}
				}
					else {
					System.out.println(year +" is a leap year");
					}
				}
			else {
				
				System.out.println(year +" is not a leap year");
			
			}
			

		}

	}
