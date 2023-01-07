package non_static;

public class nonstatic_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo();
		nonstatic_variable n=new nonstatic_variable();
		n.test();
		
	}
		int a=20;
		static int b=10;
		
		
		public static void demo()
        {
			//System.out.println(a);
			System.out.println(b);
		}
		public void test()
		{
			System.out.println(a);
			System.out.println(b);
		}
	}


