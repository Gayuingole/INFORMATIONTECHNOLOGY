package logicalprogram;

public class FACTORIAL {

	public static void main(String[] args) {
		// 3! =3*2*1=
		int a=7;
		int fact =1; //multiply by 1 we get same no
		
        for(int i=a;i>=1;i--) //5,4,3,2,1
        {
        	fact= i*fact; //5*1=5//4*5=20//20*3=60//60*2=120//120*1=120
        }
        System.out.println(fact);
	}

}
