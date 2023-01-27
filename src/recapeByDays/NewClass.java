package recapeByDays;

public class NewClass {
	
	
	public static String reverseTheWord(String str) {
		
	
		
	
		
	String s="";
		for (int i = str.length()-1;i>=0 ;i--) {
			 s+= str.charAt(i);
		}
		return s;
	}
	public static void main(String[] args) {
		
		
		String sk = reverseTheWord("Ahmad");
		System.out.println(sk);
	}

	
}
