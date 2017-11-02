import java.util.regex.*;
class RegExQuantifiers
{
	public static void main(String args[])
	{
		System.out.println(Pattern.matches("[abc]?",""));
		System.out.println(Pattern.matches("([a-zA-Z$0-9]*){6}", "aruun$2"));
	}
}
