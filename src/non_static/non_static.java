package non_static;

public class non_static{
public static void main(String[] args) {
	demo1();
	//non_static n=new non_static();
	//n.demo2();
}
int a=10;
static int b=20;
public static void demo1()
{

	non_static n=new non_static();
	n.demo2();
	System.out.println(n.a);
	System.out.println(b);
}
public void demo2()
{
	//demo1();
	System.out.println(a);
	System.out.println(b);
}
}
