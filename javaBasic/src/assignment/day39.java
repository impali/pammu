package assignment;

class Company{
	
	static int num=40;
	int age=35;
	 int love;
	public static void dimpi(int a) {
		
		System.out.println("static mtd first= "+a);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Company$$$$$$$$$$$$$$$$$$$$$" );
	}
	public static int dimpi(int a,int b) {
		
		int res=a+b;
		return res;
	}
	public static double dimpi(int c,int d,double e) {
		double res1=c+d*e;
		return res1;
	}
	public double dimpi(float f,int g,double h) {
		double res2=f+g*h;
		return res2;
	}
	public void dimpi(int f,int g,int h) {
		int love=89;
		
		double res3=f+g+h;
		System.out.println("non-static mtd second= "+res3);
		System.out.println("******************this keyword used= "+love);
		System.out.println("************************this keyword used= "+this.love);
	}
	static
	{
		System.out.println("static block first execute before main mtd");
	}
	
	{
		
		System.out.println("all non-static block execute when object created =1st non-static block");
	}
	{
		System.out.println("all non-static block execute when object created =2nd non-static block");
	}
	Company(){
this(2,3);
		System.out.println("first constructor");
	}
	Company(int ab){
this();
		System.out.println("2nd constructor");
	}
	Company(int ab,int cd){
		int age=76;

		System.out.println("3rd constructor");
	System.out.println("non-static globle variable using this keyword -it's used to diff variable in mtd & constractor when globle & local variable name is same = "+this.age);
		System.out.println("non-static globle variable using this keyword= "+age);
	}
	
	
	
	
}
class Employee extends Company{
	
	Employee(double a){
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Employee$$$$$$$$$$$$$$$$$$$$$");
		
	}
	public static void pammu(int a) {
		System.out.println("2nd static mtd first= "+a);
		
		
	}
	public static int pammu(int a,int b) {
		int res=a+b;
		return res;
	}
	
	
	public double pammu(int g,float f,double h,int a) {
		double res2=f+g*h-a;
		return res2;
	}
	public double pammu(int f,int g,int h) {
		double res3=f+g+h;
		return res3;
	}
	static {
		System.out.println("###############i m static block ");
	}
	{
		System.out.println("#############i m non static block ");
	}
	Employee(){
		this(2);
		System.out.println("111111111111 ");
	}
Employee(int a){
	this(5,6);
	System.out.println("2222222222 ");
	}
Employee(int a,int b){
	System.out.println("333333333333");
}

}
class worker extends Employee{
	
	worker(){
		super();
	System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Employ$$$$$$$$$$$$$$$$$$$$$");
}}

public class day39 {

	public static void main(String[] args) {
		System.out.println("static globle variable= "+Company.num);
		Company m1=new Company();
		System.out.println("non-static globle variable= "+m1.age);
		
		System.out.println("global variable*******************************************************");
		Company.dimpi(20);
		System.out.println("static mtd sec= "+Company.dimpi(20,10));
		System.out.println("static mtd third= "+Company.dimpi(20,10,2.2));
		System.out.println("non-static mtd first= "+m1.dimpi(9.3f, 2, 5.2));
		m1.dimpi(9, 2, 5);
		System.out.println("static & non-static mtd overloading *********************************");
     Employee m2=new Employee();//2nd con-1st-3rd..........isliye phle 3rd-1st-2nd print honga
Employee.pammu(5);
System.out.println("2nd static mtd sec= "+Employee.pammu(20,10));
System.out.println("3rd non-static mtd first= "+m2.pammu(2, 9.3f, 5.2,5));
System.out.println("non-static mtd first= "+m2.pammu(9,3,5));
	}

}
