package ImportantPrograms;

public class ReverseEachWord {
	
	static void reverseEachWord(String str)
	{
		String[] words = str.split(" ");
		String reverseString = "";
		for (int i = 0; i<words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length()-1; j >= 0; j--)
			{
				reverseWord = reverseWord + word.charAt(j);
			}
			System.out.println(reverseString = reverseString + reverseWord + " ");
		}
	}
	public static void main (String args[])
	{
		reverseEachWord("Java is a programming language");
	}

}
