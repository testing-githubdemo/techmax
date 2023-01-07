package test2.java;

public class program3 {

	public static void main(String[] args) {
		int rno=10;
		String nm="Poonam";
		int s1=10;
		int s2=18;
		int s3=10;
		int total;
		
		total=s1+s2+s3;
		if(total>=70)
		{
			System.out.println(rno);
			System.out.println(nm);
			System.out.println("Distinction");
			
		}
		else if(total<=70 && total>=40)
		
		{
			System.out.println(rno);
			System.out.println(nm);
			System.out.println("Pass class");
		}
		
		else
		{
			System.out.println(rno);
			System.out.println(nm);
			System.out.println("Fail");
		}
			
		// TODO Auto-generated method stub

	}

}
