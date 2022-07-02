package logicalprogram;

import java.util.HashMap;
import java.util.Set;

public class RepetingCharInStringUsiingHashMap {

	public static void main(String[] args)
	{
		String a = "occurance";
		HashMap<Character, Integer> H = new HashMap<>();
		for(int i =0;i<=a.length()-1;i++) 
		{
			char ch = a.charAt(i); //seprate chracters
			if(H.containsKey(ch)) 
			{
				H.put(ch, H.get(ch)+1);
			}
			else {
				H.put(ch,1);
		}
			}
		//System.out.println(H);
		Set<Character> keys = H.keySet();
		for(Character k:keys) {
			System.out.println(k+" "+H.get(k));
		}
	}

	
}
