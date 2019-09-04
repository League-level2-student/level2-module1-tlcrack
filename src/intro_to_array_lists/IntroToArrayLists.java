package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> words = new ArrayList<String>();
		//2. Add five Strings to your list
		words.add("yee");
		words.add("yeet");
		words.add("creeper");
		words.add("aw man");
		words.add("hello darkness my old friend");
		//3. Print all the Strings using a standard for-loop
		for(int i=0;i<words.size();i++) {
			System.out.println(words.get(i));
		}
		System.out.println();	
		//4. Print all the Strings using a for-each loop
		for(String s : words) {
			System.out.println(s);
		}
		System.out.println();	
		//5. Print only the even numbered elements in the list.
		int c = 0;
		for(String s : words) {
			if(c%2==0) {
				System.out.println(s);	
			}
			c++;
		}
		System.out.println();	
		//6. Print all the Strings in reverse order.
		int cb = words.size();
		for(String s : words) {
			System.out.println(words.get(cb-1));
			cb--;
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int inty = 0; inty<words.size();inty++) {
			
			for(int intier = 0;intier<words.get(inty).length();intier++) {
				if(words.get(inty).charAt(intier)=='e'||words.get(inty).charAt(intier)=='E') {
					System.out.println(words.get(inty));
					break;
				}
				
			}
			
		}
	}
}
