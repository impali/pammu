package scanerr;
import java.util.Scanner;
public class scanr {

	public static void main(String[] args) {
		int age;
		int sal;
		Scanner ref= new Scanner(System.in);
		System.out.println("age=");
		age=ref.nextInt();
		System.out.println("sal=");
		sal=ref.nextInt();
		System.out.println( age+sal);

	}

}
