package logicalprogram;

public class AmstrongNumber {

	public static void main(String[] args) {
		//armstrong number is a number that is equal to sum of cube
		//of its digit. for ex . 0,1,153,370,371
		//371-------> 3^3+7^3+1^3= 371  //^-->cube

		
		int a= 370;
		int num= 0;
		for(int i=a;i>0; i=i/10) {
			int num1= i%10;
			num= num+(num1*num1*num1);
		}
			System.out.println("orignal num is"+a);
			System.out.println("addition of digits cube is"+num);
	    
	    if(a==num) {
	    	System.out.println("given num is amstrong number");
	    }else
	    {
	    	System.out.println("given num is not amstrong number");
	    }
	}
}

