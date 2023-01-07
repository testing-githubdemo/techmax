package test2.java;

public class method_para {
	//method with parameters
	public static void main(String[] args) {
		add(10.5f,30);
	}
	
	public static void add(float a,int b) {
		float c=a+b;
		System.out.println("Addition is"+" "+c);
	}
	public static void sub(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}
	public static void mult(int a,int b) {
		int c=a*b;
		System.out.println(c);
	}
	public static void div(int a,int b) {
		int c=a/b;
		System.out.println(c);
	}
	

}
