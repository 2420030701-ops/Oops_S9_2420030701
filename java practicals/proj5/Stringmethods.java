package hello;

public class Stringmethods {
	public static void main(String[] args) {
	String str="java programing";
	String anotherStr = "hello, world!";

	System.out.println("the length of the string is :"+ str.length());
	System.out.println("the char at index is : "+ str.charAt(3));
	System.out.println("the substring in begining method: "+ str.substring(5));
	System.out.println("sbstring beging and ending method "+ str.substring(1,5) );
	System.out.println("Equals: " + str.equals(anotherStr));
	System.out.println("in trim : " + str.trim());
	System.out.println("Compare the two strings: " + str.compareTo(anotherStr));
	System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(anotherStr));
	System.out.println("Compare To Ignore Case: " + str.trim().compareToIgnoreCase(anotherStr));
	System.out.println("Contains 'World': " + str.contains("World"));
	 System.out.println("Starts with ' He': " + str.startsWith(" He"));
	 System.out.println("Ends with '! ': " + str.endsWith("! "));
	 System.out.println("Index of 'World': " + str.indexOf("World"));
	 System.out.println("Last Index of 'l': " + str.lastIndexOf("l"));
	 System.out.println("Trimmed: '" + str.trim() + "'");
	  System.out.println("Replace 'l' with 'x': " + str.replace('l', 'x'));
	  System.out.println("ReplaceAll 'o' with '0': " + str.replaceAll("o", "0"));
	  System.out.println("ReplaceFirst 'o' with '0': " + str.replaceFirst("o", "0"));
	  System.out.println("Lowercase: " + str.toLowerCase());
	  System.out.println("Uppercase: " + str.toUpperCase());
	  System.out.println("Is Empty: " + str.isEmpty());
	  int num = 123;
      System.out.println("Value Of int: " + String.valueOf(num));



	

	
	
	
	
	
	}

}