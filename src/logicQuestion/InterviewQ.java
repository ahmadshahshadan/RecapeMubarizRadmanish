package logicQuestion;
import java.util.*;
public class InterviewQ {
	
	public static void main(String[] args) {
		
//	     Write a program which returns even numbers only
//	        
//	        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList ( 1 , 2 , 5 , 343 , 12 , 6 , 8 , 9 , 34 , 53 ));
//	    
//	       for (int i = 0; i < numbers.size(); i++) {
//	           if(numbers.get(i) % 2 == 0){
//	               System.out.println(numbers.get(i));
//	           }
//	       }
//
//	        System.out.println(m1(numbers));
//	
////	    -----------------------------------------------------
//	    static ArrayList m1(List<Integer> a){
//	        ArrayList<Integer> returnList = new ArrayList();
//	        for (int i = 0; i < a.size(); i++) {
//	            if(a.get(i) % 5 == 0){
//	                returnList.add(a.get(i));
//	            }
//	        }
//	    
//	        return returnList;
//	    
//	-------------------------------------------	
   // How to remove names which contain a speciﬁc letter “e” from a collection type?
		
//	       String[] namesArray1 = { "Ali" , 
//	             "Veli" , "Semavi" , 
//	             "Sami" , "Hayati" , "Memati" , 
//	             "Canan" };
//	
//	       Set<String> nSet = new LinkedHashSet<>();
//	       nSet.addAll(Arrays.asList(namesArray1));
//	       System.out.println(nSet);
//	       
//	       Iterator y = nSet.iterator();
//	       while (y.hasNext()) {
////	    	   System.out.println(y.next());
//	       
//	       String u = y.next().toString();
//	       if (u.contains("a")) {
//	    	   y.remove();
//	       }
//	}
//	
//		System.out.println(nSet);
	       
//        String[] namesArray = { "Ali" , 
//            "Veli" , "Semavi" , 
//            "Sami" , "Hayati" , "Memati" , 
//            "Canan" };
//       
//        Set<String> namesSet = new LinkedHashSet<>();
////        System.out.println(namesSet);
//        namesSet.addAll(Arrays.asList(namesArray));
//        
//       System.out.println(namesSet);
//       
//       Iterator x = namesSet.iterator();
//     while(x.hasNext()){
//         System.out.println(x.next());
//     
//          String s = x.next().toString();
//        
//          
//          if(s.contains("e")){
////              namesSet.remove(s);
//               x.remove();
//          }
//     }
//     
//     System.out.println(namesSet);
	
//		------------
////	Remove Element == 1 by value of index in the if statement.
//	ArrayList <Integer> kh1 = new ArrayList();
//	kh1.add(1);
//	kh1.add(5);
//	kh1.add(9);
//	kh1.add(19);
//	for (int i = 0 ; i<kh1.size();i++) {
//		if (kh1.get(i) == 9) {
//			kh1.remove(i);
//		}
//	}
//System.out.println(kh1);
//		
////		Remove Element == 1 by number of index in the sysout
//		ArrayList <Integer> kh = new ArrayList();
//		kh.add(1);
//		kh.add(5);
//		kh.add(9);
//		kh.add(19);
//		for (int i = 0 ; i<kh.size();i++) {
//			if (kh.get(i) == 5) {
//				kh.remove(2);
//        removeAll --> is a method that will delete all the contains of the string. syntax --> ArrayListName.removeAll(ArrayListName)
//			}
//		}
//  System.out.println(kh);
		
//		------- reverse by For Loop and StringBuffer
		
////		Reverse by StringBuffer methods
//		String a = "Sharif";
//		String ra = new StringBuffer(a).reverse().toString();
//		System.out.println(ra);
//		
////		Reverse By for loop
//		String b = "Shadan";
//		for (int i = b.length()-1; i>=0;i--) {
//			System.out.print(b.charAt(i));
//		}

//    String g = "Shahgul";
//   for (int i = g.length()-1; i>=0; i--) {
//	   System.out.print(g.charAt(i));
//			
//		}
//		
//	===============================	
//		String a = "ahmadaa11s";
//		String ra = new StringBuffer(a).reverse().toString();
//		System.out.println(ra);
//		------- Reverse String 
//		String0;  a = "shanGulJan";
//		String ra = new StringBuffer(a).reverse().toString();
//		System.out.println(ra);
		

//	------- Reverse/Palindrome by If Else

//		String s = "shoohws";
//		String rs = new StringBuffer(s).reverse().toString();
//		System.out.println(s.equals(rs) ? "Palindrome": "No Palindrome");
		
//String c = "My  h  yM";
//String rc = new StringBuffer(c).reverse().toString();
//if (c.equals(rc)) {
//	System.out.println("Palindrome");
//}else {
//	System.out.println("No Palindrome");
//}
	
		
////	--------------------------------------	
////		 Reverse the String of Or Palindrome
		
		
		String  a = "nagfan";
		String ra = new StringBuffer(a).reverse().toString();
		
		System.out.println(a.equals(ra)? "Palindrome" : "Not Palindrome");
//		String ab = "kaakaak";
//		String ra = new StringBuffer(ab).reverse().toString();
//		System.out.println(a.equals(ra) ? "Palindrome":"No Palindrome");
		
	     
	}

}
