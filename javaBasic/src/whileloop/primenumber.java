package whileloop;

public class primenumber {

	public static void main(String[] args) {
		int i=1,count=0,num=1,n=0;
		
		System.out.println("prime no.");
		while(n<25) {
			num=1;
			count=0;
			while(num<=i) {
				if(i%num==0) 
					count++;
					num++;
				}
			
			if (count==2) {
				System.out.println(i);
				n++;
				
			}
			i++;		
	}

}
}
