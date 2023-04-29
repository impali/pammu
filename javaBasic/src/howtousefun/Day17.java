package howtousefun;

public class Day17 {

	public static void main(String[] args) {
	System.out.println(Day17.functions1(10,5,2));
	//double sum=functions2(2,3,4);
	//System.out.println(sum);
	//*******************static**************************
	
	System.out.println(Day17.functions2(10,5,2));// static ...(classname.methodname) writ in print 
	//or
	Day17.functions3(2,3);//static in void...(classname.methodname) not in print 
	
	//******************* non-static**************************
Day17 sub=new Day17();// non static ...(classname refvariable= new classname()
double res =sub.functions4(2,2,2);// store the refvari's value in another variable 
System.out.println(res);// and then print another variable
//********************** static and non static method **********
	}
	public static double functions1(int p,int q,double r) {//other then void return krna jaruri hai ...method
		return p+q-r;
	}

	public static double functions2(double a,double b,double c) {//with different mtd
		double res=a*b*c;
		return res;
	}
	public static void functions3(int d,int e) {// with void 
		int result=d+e;
		System.out.println(result);
	}
	public double functions4(double x,double y,double z) { //non-static mtd
		
		return x*y*z;
		
}
}

