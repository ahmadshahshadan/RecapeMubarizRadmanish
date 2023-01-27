package collectionJava;
import java.util.*;

import java.util.ArrayList;

public class ClassListAndLogic {
	public static void main(String[] args) {
//		 interview question . byte for c is not correct because when we use + operator it will show error for byte only we can use int when we use + operator
//		byte a = 4;
//		byte b = 5;
//		int g = a+b;
//		System.out.println(g);
//		
//     String s = "Ahmad";
//      for (int i = s.length()-1; i >=0; i--){
//    	  System.out.print(s.charAt(i));
//      }
//		int a = 15;
//		while (a >12) {
//			System.out.println("Yes");
//			a--;
//		}
		
//		for (int a = 0 ; a <= 3; a++) {
//			for (int b = 0; b<=3;  b++) {
//				System.out.print(" "+0);
//			}
//			System.out.println("");
//		}
		
//		for (int v = 0; v <4; v++) {
//			for (int z = 1; z <5; z++) {
//				System.out.print(" *");
//				
//			}
//			System.out.println();
//		}
//		
//		int[] listSalaries = {100,200,300,400,500,555,666};
////          0   1   2   3 // index
//int x = listSalaries[6];
//int x1 = listSalaries[3];
//System.out.println(x);
//System.out.println(x1);
////		System.out.println(listSalaries.length);
//		String name = "Sharif Is The GOOD boy in the City";
//		String n = name.replaceAll(" ", "");
////		System.out.println(n);
////		
////		String cc = "";
////		String vc = "";
////		
//		
//		
//		int c = 0;
//		int v = 0;
//		for (int i = 0; i<n.length(); i++) {
//			char ch = n.charAt(i);
//			if (ch>65 && ch<90) {
//				v++;
//			}else {
//				c++;
//			}
//		}
//		System.out.println(c);
//		System.out.println(v);
		
//		int a = 2;
//		int b = 0;
//		int c = 0;


	
	
	
//			a = a+4;
//			b = b+2;
//			c = c+1;
//				
//			}
//		S      tem.out.println(c);
//		}
//		
//		String text = "I Want To Study A lot but I A Z K";
//		String t = text.replaceAll(" ", "");
//		String lower = " ";
//		String upper = " ";
//		for (int i = 0; i<t.length();i++) {
//		
//		char ch = t.charAt(i);
//		if (ch>=65 && ch<=90) {
//			upper=upper+ch;
//		}else {
//			lower=lower+ch;
//		}
//		}
		
//		System.out.println("low:"+lower);
//		System.out.println("upper:"+upper);
		
		
//		
//		String h = "You are Very Brave Person in Your Area";
//		String g = h.replaceAll(" ", "");
//		System.out.println(g);
//		
//		String lower = "";
//		String upper = "";
//		
//		for (int i = 0; i<g.length(); i++) {
//			char cha = g.charAt(i);
//			if (cha >=97 && cha<=122) {
//				lower=lower+cha;
//			}else
//			{
//			upper=upper+cha;
//		}
//		}
//     System.out.println("upper" +upper);
//     System.out.println("Lower"+lower);
//		
		
//		String text = "I want To stay with You h in the Night A Z K";
//		String t = text.replaceAll(" ", "");
//		int lower = 0;
//		int upper = 0;
//		for (int i = 0; i<t.length();i++) {
//		
//		char ch = t.charAt(i);
//		if (ch>=65 && ch<=90) {
//			upper++;
//		}else {
//			lower++;
//		}
//		}
//		System.out.println("Count upper:" +upper);
//		System.out.println("Count lower:"+lower);
			
		

		String tx = "I want To stay with You h in the Night A Z K";
	String ty = tx.replaceAll(" ", "");
	
	int v = 0;
	int c = 0;
	for (int i = 0; i<ty.length(); i++) {
		if ("aeiou".contains(String.valueOf(i).toString())) {
			v++;
			
		}else {
			c++;
		}
		
	}
	
		
//		int v = 0;
//		int c = 0;
//		for (int i = 0; i<ty.length();i++) {
//			if ("aeiou".contains(String.valueOf(i).toString())) {
//				v++;
//				
//			}else {
//				c++;
//			}
//		
//		}
		System.out.println(v);
		System.out.println(c);
			
//		}
		
//		String vovel = "I am going to go Virginia tomorrow do you want to go with me aeiou ";
//		String a = vovel.replaceAll(" ", "");
//		
//		int v = 0;
//		int c = 0;
//		for (int i = 0; i<a.length(); i++) {
//			if ("aeiou".contains(String.valueOf(a.charAt(i)))) {
//				v++;
//			}else {
//				c++;
//			}
//	
//			}
////		}
//		
//		System.out.println("vovel:"+v);
//		System.out.println("consonent:"+c);
	
//	String h = " welcome to our city my best friend if you have some problem let me know";
//	String k = h.replaceAll(" ", "");
//	int va = 0;
//	int co = 0;
//	for (int i = 0; i<k.length();i++) {
//		if ("aeiou".contains(String.valueOf(k.charAt(i)))) {
//			va++;
//		}else {
//			co ++;
//		}
//		
//	}
//	System.out.println("va: "+va);
//	System.out.println("co: "+ co);
//		
		

//		String vo = vovel.replaceAll(" ", "");
//		System.out.println(vo);
//		int vcount = 0;
//		int ccount = 0;
//		for(int i = 0; i<vo.length();i++) {
//			if ("aeiou".contains(String.valueOf(vo.charAt(i)))) {
//				vcount++;
//				
//			}else {
//				ccount++;
//			}
//			}
//		System.out.println("vcount:" + vcount);
//		System.out.println("ccount:" + ccount);
//		}
		
		
//		ArrayList st = new ArrayList();
//		st.add("Sur");
//		st.add("wat");
////		System.out.println(st); 
//		
//		ArrayList st1 = new ArrayList();
//		st1.add("Ahmad");
//		st1.add("sharif");
//		st1.addAll(0, st);
//		st1.set(0, "Ahmad");
//		System.out.println(st1);
////		System.out.println(st1.indexOf("wat"));
//		
//		for (int i = 0 ; i < st1.size(); i++) {
//			if (st1.get(i) == "Ahmad" || st1.get(i) == "wat") {
////				st1.set(i, "Shadan");
//				st1.set(i, "Surwat");
//				
//			}
//		}
//		System.out.println(st1);
//		
}

}
