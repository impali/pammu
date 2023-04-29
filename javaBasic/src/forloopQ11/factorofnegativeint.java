package forloopQ11;

public class factorofnegativeint {

	public static void main(String[] args) {
		

			
				int num1=-60;
				for (int i=num1; i<=Math.abs(num1); ++i) {//math.abs() method return the absolute value of the no.
					if(i==0) {
						continue;
					}
					else {
					if(num1%i==0) {
						System.out.print(i+" ");
					}
				}

			}

			}
		}

	
