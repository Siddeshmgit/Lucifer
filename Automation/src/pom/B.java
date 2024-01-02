package pom;

public class B {
public static void main(String[] args) {
	A a1=new A(30);
	System.out.println(a1.getI());
	a1.setI(20);
	System.out.println(a1.getI());
}
}
