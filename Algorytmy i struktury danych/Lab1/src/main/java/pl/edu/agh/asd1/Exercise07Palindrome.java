package pl.edu.agh.asd1;

public class Exercise07Palindrome {
    public static final boolean isPalindrome(String n) {
        // TODO: implement
    	StringBuilder sb = new StringBuilder(n.toLowerCase());
    	sb.reverse();
    	String reverse = sb.toString();
        return reverse.equals(n.toLowerCase());
    }
}
