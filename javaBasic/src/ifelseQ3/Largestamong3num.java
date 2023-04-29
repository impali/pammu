package ifelseQ3;

public class Largestamong3num {

	public static void main(String[] args) {
		
Love.pammu(3.2,5.5,8.1);
Love.pammu(-3.2,10.5,7.1);
	}

}
 class Love {

	public static void pammu(double a,double b,double c) {
		if(a>=b && a>=c) {
			System.out.println(a+" is largest number");
		}
		else if(b>=a && b>=c) {
			System.out.println(b+" is largest number");
		}
		else {
			System.out.println(c+" is largest number");

	}

}
 }