package ImportantPrograms;

import java.util.ArrayList;

public class Program2 {
	
	public static void main(String args[]) {
		/*String input = "Software Testing Document";
		String reverse= "";
		System.out.println("String before reverse:"+input);
		int len = input.length();
		for ( int i=len-1; i<len; i--) {
			reverse.charAt(i);
			
		}*/
		
		ArrayList<String> list = new ArrayList<String>();
		 
        list.add("AAA");
 
        list.add("BBB");
 
        list.add("ccc");
 
        list.add("DDD");
 
        list.add("e");
 
        System.out.println(list);     //Output : [AAA, BBB, ccc, DDD, e]
 
        //Removing an element from position 2
 
        list.remove(2);
 
        System.out.println(list);    //Output : [AAA, BBB, DDD, e]
 
        //Removing an element from position 3
 
        list.remove("e");
        list.set(1, "000");
 
        System.out.println(list);   //Output : [AAA, BBB, DDD]
		
	}

}
