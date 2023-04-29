package castjng;
//(inheritance,overriding,upcasting) jb tino sath ho usse run time -polymorphism khte h

class derived{
	public void deri() {
		System.out.println("non-primitive1");
		
	}
}
class nonpri extends derived {
	public void non() {
		System.out.println("non-primitive2");
		
	}
}
 

public class casting {

	public static void main(String[] args) {
		int x=10;
		long y=x;//primitive {widing(implicite)}type casting
		System.out.println(y);
		long z=(long)x;//primitive {widing(explicite)}type casting
		System.out.println(z);
		double a=14.9;
		long c=(long)a;//narrowing(explicite)
		System.out.println(c);
		nonpri d1= new nonpri();
		//derived d2= new nonpri();//up casting (implicite)
		derived d2= (derived)new nonpri();//up casting (explicite)
		d2.deri();
		d1.non();
		d1.deri();
		//java me down casting possible nhi h lekin down casting sirf uski ho sakti hai jo upcast hua honga 
		nonpri s1=(nonpri)d2;
		s1.deri();
		s1.non();
		
	}

}
