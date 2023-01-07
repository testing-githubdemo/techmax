package non_static;

public class non_static2 {

	public static void main(String[] args) {
		//add();
		//non_static2.add();
		non_static2 n=new non_static2();
		n.add();
		
		
		//same class
		//sub(20,10);
		non_static2.sub(80,30);
		


	}
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public static void sub(int g,int f)
	
	{
		int s=g-f;
		System.out.println("substraction is:"+s);
	}

}
