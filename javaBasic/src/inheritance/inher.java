package inheritance;

class fruit{
	int age=20;
	fruit(int c,int d){
		super();
		int age=30;
	System.out.println("fruit class");
	System.out.println(c);
	System.out.println(d);
	System.out.println("1age="+age);
	System.out.println("2age="+this.age);
	
	}
	 void manga(){
		
		System.out.println("manga class");
		
	
	
	}
}
class apple extends fruit{
	int age=40;
	apple(int a){
		
		super(2,3);
		
		System.out.println("apple class");
		System.out.println(a);
		super.manga();
		System.out.println("sage="+super.age);
		System.out.println("nage="+age);
	}
}
class mango extends apple{
	mango(){
		super(2);
		System.out.println("mango class");
		
	}
}



public class inher {
int age=10;
	public static void main(String[] args) {
		mango r1=new mango();
		

	}

}
