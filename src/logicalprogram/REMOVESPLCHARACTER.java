package logicalprogram;

public class REMOVESPLCHARACTER {

	public static void main(String[] args) 
	{
		String a = "Velocity@";
		System.out.println(a.replaceAll("@", ""));
      //formultiplesplcharacter
		String b="Velo@city3#12";
		System.out.println(b.replaceAll("[^a-zA-z]", ""));
	}
	

}
