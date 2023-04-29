package forloopQ7;

public class reversenum {

	public static void main(String[] args) {
		int num =123,rev=0,rem;
		for(;num!=0 ;num=num/10) {
			rem=num%10;
			rev=rev*10+rem;
						
		}
		System.out.println("Reverse Number:"+rev);

	}

}
