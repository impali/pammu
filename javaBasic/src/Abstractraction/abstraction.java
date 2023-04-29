package Abstractraction;

abstract class b {

	abstract public void pali();//abstract class kabhi final nhi ho skti or nahi hi static
	public void dimp() {
		 System.out.println("*****non-static  mtd********");
	}
		
		//interface face me vari-public static final hota h & mtd-public void
	

}
 class a extends b {
	public void pali() {
		 System.out.println("*****ast mtd********");
	 }
	 static void pammu() {
		System.out.println("non-abstraction mtd");

	}
	
}

 class abstraction {

	public static void main(String[] args) {
		b d1=new a();
		d1.pali();

	}

}
