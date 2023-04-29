package whileloopQ5;

public class armstrongnum {

	public static void main(String[] args) {
		int num=371, orignalNum,rem,res=0;
		orignalNum=num;
		while(orignalNum!=0) {
			rem=orignalNum%10;
			res+=Math.pow(rem, 3);
			orignalNum/=10;
		}
		if(res==num) {
			System.out.println(num+" is armstrong number");}
		else {
			System.out.println(num+ " is not armstrong number");
		}

	}

}
