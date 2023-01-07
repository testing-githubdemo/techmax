package test2.java;

public class method_returntype {
	public static void main(String[] args) {
		
		int c=add(10,6);
		System.out.println("Addition is "+""+c);
		
		float s=sub(10.2f,5);
		System.out.println("substraction is"+" "+s);
		
		double m=mult(2.5,2.7f);
		System.out.println("Multiplication is"+m);
		
		String s1=test("Poonam");
		System.out.println("String is"+" "+s1);
				
	}
	public static int add(int a,int b)
	{
		
		return(a+b);
	}

	public static float sub(float a,int b)
	{
		return(a-b);
	}
	public static double mult(double a,float b)
	{
	return(a*b);
	}
	public static String test(String a)
	{
		return(a);
	}
}
