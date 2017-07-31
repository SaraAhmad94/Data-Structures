package Interview;

public interface Palindrome {
	public static boolean PalindromeRecursion(String s)
	{   
		if(s.length()== 0 || s.length() == 1)
		{
			return true; 
		}
        if(s.charAt(0) == s.charAt(s.length()-1))
        {
        return PalindromeRecursion(s.substring(1, s.length()-1));
        }
        else
        {
        return false;
        }

	}
	public static void main(String[] args)
	{
		if(PalindromeRecursion("A12345"))
            System.out.println(" is a palindrome");
        else
            System.out.println(" is not a palindrome");

	}
}
