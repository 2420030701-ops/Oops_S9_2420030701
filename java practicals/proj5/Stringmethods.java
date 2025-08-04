package hello;

public class Stringmethods {
	 public static void main(String[] args) {
	        String text = "  Java Programming  ";

	        System.out.println("Original: '" + text + "'");
	        System.out.println("Trimmed: '" + text.trim() + "'");
	        System.out.println("Uppercase: " + text.toUpperCase());
	        System.out.println("Lowercase: " + text.toLowerCase());
	        System.out.println("Length: " + text.length());
	        System.out.println("Character at index 5: " + text.charAt(5));
	        System.out.println("Substring (5 to 15): " + text.substring(5, 15));
	        System.out.println("Replace 'a' with '@': " + text.replace('a', '@'));
	        System.out.println("Contains 'Pro': " + text.contains("Pro"));
	        System.out.println("Starts with '  Ja': " + text.startsWith("  Ja"));
	        System.out.println("Ends with 'ing  ': " + text.endsWith("ing  "));
	    }

}

