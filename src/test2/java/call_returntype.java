package test2.java;

public class call_returntype {
	//call return_type method at class method_returntype
public static void main(String[] args) {
	int c=method_returntype.add(2, 4);
	System.out.println(+c);
	float s=method_returntype.sub(2.3f, 4);
	System.out.println(s);
	double m=method_returntype.mult(2.5, 4.0f);
	System.out.println(m);
	String s1=method_returntype.test("Hello");
	System.out.println(s1);
	
	
}
}
