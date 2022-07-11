package lab;

import java.util.*;

class My_Dictionary 
{
	public static void main(String[] args)
	{
		// creating a My HashTable Dictionary
		Map<String, String> my_dict = new HashMap<String, String>();

    // Using a few dictionary Class methods
		// using put method
		my_dict.put("Perplexed", "Confused");
		my_dict.put("chopper", "Helicopter");
		my_dict.put("joy", "happy");
		my_dict.put("profound", "intense");
		my_dict.put("furious", "enraged");
		my_dict.put("yearn","expectation");
		for(Map.Entry<String,String>entry:my_dict.entrySet()) {
			 System.out.println(entry.getKey() + "--- "+entry.getValue());
		}
	}
}
	    