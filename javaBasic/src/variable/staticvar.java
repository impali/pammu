package variable;

public class staticvar {
	public static long mob=123;
	static char grade='a';
int age=35;
//static and non static variable in java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticvar ref= new staticvar();
		
System.out.println(+ref.age);
ref.age=25;
System.out.println("staticvariable:"+ref.age);
staticvar demo= new staticvar();
System.out.println("xyz:"+demo.age);
mob=345;
System.out.println(mob);
long mob=987;
System.out.println(staticvar.mob);
System.out.println(mob);
char grade='B';
System.out.println(grade);
System.out.println(staticvar.grade);

}
	
}

