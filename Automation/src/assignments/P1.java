package assignments;

public class P1 {
	static int a=10;
	
	public static void main(String[] args) {
		System.out.println(a);
		int a=20;
		System.out.println(a);
		System.out.println(P1.a);
		P1 obj=new P1();
		System.out.println(P1.a);
	}
	public void test()
	{
		System.out.println(a);
		P1 obj=new P1();
		System.out.println(obj.a);
		System.out.println(this.a);
		System.out.println(P1.a);
	}


}
