package encapsulation;

public class gettersetter {

	private int empid=100;
	public static long amp=12;

	public static void main(String[] args) {
		//System.out.println(empid);//not possible direct to access private variable..
		System.out.println(amp);
		gettersetter d1=new gettersetter();
		System.out.println(d1.getEmpid());//only for print getter
d1.setEmpid(200);//only for value change setter
System.out.println(d1.getEmpid());
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

}

