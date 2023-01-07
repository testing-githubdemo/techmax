package non_static;

public class swapno {
public static void main(String[] args) {
	
	int a=100;
	int b=400;
	System.out.println("before swap value of a is"+" "+a+" " +"\n"+"and"+" "+" before swap value of b is"+" "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("value of a is"+" "+a+" "+"and"+" "+"value of b is"+" "+b);
}
}
