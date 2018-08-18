package ImportantPrograms;

import java.util.HashMap;
import java.util.Set;

public class DuplicateElements {
	
	public static void main(String[] args) {
		String str = "Programming";
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				int val = map.get(ch);
				map.put(ch, val + 1);			
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		Set<Character> charsInString = map.keySet();
		for (char ch: charsInString) {
			if (map.get(ch) > 1) {
				System.out.println(ch + ":" + map.get(ch));
			}				}
		
	}

}
