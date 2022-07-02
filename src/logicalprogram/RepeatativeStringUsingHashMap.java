package logicalprogram;

import java.util.HashMap;
import java.util.Set;

public class RepeatativeStringUsingHashMap {

	public static void main(String[] args) {
		String str1= "abc xyz pqr abc pqr lmn";
		String[]ar = str1.split(" ");
		HashMap<String, Integer>map= new HashMap<>();
		for(int i=0;i<=ar.length-1;i++) 
		{
			String s1 = ar[i];
			if(map.containsKey(s1)) 
			{
         map.put(s1, map.get(s1)+1);
	   }
			else
			{
             map.put(s1, 1);
           }
			}
		Set<String> keys = map.keySet();
		for( String k:keys) {
			System.out.println(k+" "+map.get(k));
		}
		}
	}