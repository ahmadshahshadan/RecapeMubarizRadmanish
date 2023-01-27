package collectionJava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListLogic {
	
	public static void main(String[] args) {
		
		
//		String a = "Ahmad Want to Come to our House to Night";
	
//		String aa = a.replace(" ", "");
//		System.out.println(aa);
//        String [] ab = aa.split("");
//        List<String> abc = Arrays.asList(ab);
//        System.out.println(abc);
////        
//        int con = 0;
//        int vov =0;
//        for (int i = 0; i<aa.length();i++) {
//        	if ("aeiou".contains(abc.get(i).toString())) {
//        		vov++;
//        	} else {
//        		con++;
//        	}
//        	
//        }
//        System.out.println(con+ " Consonent");
//    	System.out.println(vov+ " Vovel");
		
////		logic for finding of Vovel and Consonent letters from a String
//		String st = " We should Go Hidai Next Month Do you Want";
//		String s = st.replaceAll(" ", "");
//		System.out.println(s);
//		
//		String [] st1 = st.split("");
//		List<String> lis = Arrays.asList(st1);
//		
//		int a = 0;
//		int b = 0;
//		for (int i = 0; i<st.length();i++) {
//			
//			if("aeiou".contains(lis.get(i).toString())){
//				a++;
//			}else {
//				b++;
//			}
//		}
//		System.out.println(a);
//		System.out.println(b);
//		
//		this formula show the upper and lower case alphabet when we write their numbers . upper case (65 up to 90), lower case (97 up to 122)
//		

		
////		logic for finding of uppercase and lowercase letters from a String
//		
		String st = " We should Go Hidai Next Month";
//		
		
		String upper = "";
		String lower = "";
		for (int i = 0; i<st.length();i++) {
			char ch = st.charAt(i);
			if(ch>=65 && ch >=90) {
				lower=lower+ch;
			}else {
				
				upper=upper+ch;
			} 
		}
		System.out.println("upper : " +upper);
		System.out.println("lower : " +lower);
		
		
		
		
		
		
//		logic for finding number of uppercase and lowercase letter from a String
//		String text1 = " We should Go Hidai Next Month";
//		int upper = 0;
//		int lower = 0;
//		for (int i = 0; i<text.length();i++) {
//			
//			char ch = text.charAt(i);
//			if (ch >=65 && ch <=90) {
//				upper++;
//				
//			}else {
//				lower++;
//			}
//		}
//		System.out.println("upper" +upper);
//		System.out.println("lower"+ lower);
	}

}
