package logicalprogram;

public class ReverseMiddleString {

	public static void main(String[] args) {
		String sample ="abc pqr xyz";
		String[]ar=sample.split("");
		System.out.println(sample);
		//String ar[] ={"abc","pqr","xyz"};
		//                           0      1   2
		for(int i=0;i<ar.length-1;i++) 
		{
			if(i%2==0) 
			{
				String s =ar[i];
				ar[i]=revString(s); 
				System.out.println(ar[i]+"");
			}
			else 
			{
				System.out.println(ar[i]+"");
			}
		}

	}

	private static String revString(String inp) {
		String rev="";
		for(int i =inp.length()-1;i>=0;i--) {
			rev= rev+inp.charAt(i);
		}
		return null;
	}

}
