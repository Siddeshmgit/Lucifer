package handling_popups;

public class VarArgs {
public static void main(String[] args) {
	VarArgs.demo(10,20,40,49,4,34);
}
public static void demo(int...a) {
int count = a.length;
int sum=0;
for(int i=0;i<count;i++) {
	sum=sum+a[i];
}
System.out.println(sum);
System.out.println(count);
}
}
