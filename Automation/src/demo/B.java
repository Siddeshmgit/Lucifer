package demo;

public class B {
public static void main(String[] args) {
	A a1=new A(30);
	System.out.println(a1.getI());		//30
	a1.setI(20);
	System.out.println(a1.getI());		//20
}
}
