import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile(".s");//. represents single character  
		Matcher m = p.matcher("as");  
		boolean b = m.matches();  
		System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
		System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
		System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
		System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
		System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)  
	}

}



//The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings.
//
//It is widely used to define the constraint on strings such as password and email validation. 

//
//Matcher class
//It implements the MatchResult interface. 
//It is a regex engine which is used to perform match operations on a character sequence.

//Pattern class
//It is the compiled version of a regular expression. 
//It is used to define a pattern for the regex engine.