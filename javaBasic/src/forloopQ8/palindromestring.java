package forloopQ8;

public class palindromestring {

	public static boolean main(String str) {
		int n=str.lenght();
		for(int i=0;i<n/2;i++)
if(str.charAt(i)!=str.charAt(n-i-1))
	return false;
		return true;
	}

}
