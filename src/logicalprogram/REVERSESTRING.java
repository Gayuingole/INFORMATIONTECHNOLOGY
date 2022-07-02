package logicalprogram;

public class REVERSESTRING {

	public static void main(String[] args) {
		String org ="INGOLE";
		String rev= "";
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		System.out.println("Orignal string ="+org);
		System.out.println("Reverse string ="+rev);

	}

}
