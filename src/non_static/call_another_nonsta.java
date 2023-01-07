package non_static;

public class call_another_nonsta {

	public static void main(String[] args) {
		non_static2 a=new non_static2();
		a.add();
		
		//nonstatic method with parameter in diff class
		non_static2.sub(40,30);

	}

}
