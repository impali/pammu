package methodoverloading;
//only static mtd overloading ko compile-time polymorphism khte h
public class TotalRecallConcepts {
	static int age1;
	static double salart1 = 2536.0326;
	int age2;
	double salart2 = 568.898;

	public static void main(String[] args) {
		TotalRecallConcepts.display(10, 5);

		System.out.println("static variable......:" + TotalRecallConcepts.display(10));
		TotalRecallConcepts ref = new TotalRecallConcepts();
		double sub = ref.display(4, 2.0);
		System.out.println("non-static mtd:" + sub);
		double m1 = ref.display(4.3, 2);
		System.out.println("non-static mtd:" + m1);
		System.out.println("access non-static variable:" + ref.age2);
		System.out.println(" access non-static variable:" + ref.salart2);
		System.out.println("access static variable:" + age1);
		age1 = 20;
		System.out.println(" access static variable:" + age1);
		int age1 = 30;
		System.out.println("access static variable:" + age1);
		System.out.println("access static variable:" + TotalRecallConcepts.salart1);
		ref.salart2 = 2000;
		System.out.println("non-static variable:" + ref.salart2);

	}

	static void display(int a, int b) {

		double res = a + b;
		System.out.println("static mtd:" + res);

	}

	static int display(int m) {

		return m;
	}

	public double display(int c, double d) {
		return c - d;
	}

	double display(double f, int e) {

		return f * e;
	}

}
