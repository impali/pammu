package palindromenum;

public class palinum {

	public static void main(String[] args) {
		
		
	int num=35554;
		int rev=0,rem;
		int orgNum=num;
		
		while(num!=0) {
			rem=num % 10;
			rev=rev*10+rem;
			num=num/10;
		}
if (orgNum==rev) {
	System.out.println("palidrome number");}

else {
	System.out.println("not palidrome number");
	}}

}
