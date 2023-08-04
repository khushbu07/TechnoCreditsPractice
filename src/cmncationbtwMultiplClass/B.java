package cmncationbtwMultiplClass;

public class B {
	
	void m2(){
		System.out.println("m2-ClassB");
		B.m3();
	}
	
	static void m3(){
		System.out.println("m3-ClassB");
		C c=new C();
		c.m4();
	}
	

}
