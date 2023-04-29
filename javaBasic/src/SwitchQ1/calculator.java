package SwitchQ1;

public class calculator {

	public static void main(String[] args) {
		
		calculator1.cal(10,5,'-');
		calculator1.cal(10,5,'%');
	}

}
 class calculator1 {

	public static void cal(int a, int b,char op) {
		switch(op) {
		case'+':
			int res=a+b;
			System.out.println(a +"+"+b+"="+res);
			break;
		case'-':
			int res1=a-b;
			System.out.println(a +"-"+b+"="+res1);
			break;
		case'*':
			int res2=a*b;
			System.out.println(a +"*"+b+"="+res2);
			break;
		case'/':
			int res3=a-b;
			System.out.println(a +"/"+b+"="+res3);
			break;
		default:
			System.out.println("SError:unsupported operation");
			
		}

	}

}
