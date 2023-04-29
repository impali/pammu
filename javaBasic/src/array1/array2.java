package array1;
import java.util.Arrays;
public class array2 {

	public static void main(String[] args) {
		int[]num= {1,2,3,4,5};
		System.out.println(num.length);
		System.out.println(num[1]);
		for(int a:num) {
			System.out.println(a);//for each loop
		}
		{
			System.out.println("program end");
		}
		num[0]=10;
		for(int b:num) {
			System.out.println(b);//for each loop
		}
		{
			System.out.println("program end");
		}
		int[]num2=Arrays.copyOf(num,4);
		System.out.println(num2);

	}

}
