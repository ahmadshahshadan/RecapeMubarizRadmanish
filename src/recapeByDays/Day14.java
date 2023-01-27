package recapeByDays;
import java.util.*;
public class Day14 {
	
	public static void main(String[] args) {
		
		
//		String a = "Why You Are Doing This Work";
//		String ab = a.replaceAll(" ", "");
//		System.out.println(ab);
//		int upper = 0;
//		int lower = 0;
//		for (int i = 0; i<ab.length();i++) {
//			char cha = ab.charAt(i);
//			if(cha >=65 && cha <=90) {
//			  upper= +cha;
//			}else {
//				lower=+cha;
//			}
//		}
		
		
		
		

      String st1 = " We should Go Hidai Next Month";
String st = st1.replaceAll(" ", "");
String upper = "";
String lower = "";
for (int i = 0; i < st.length();i++) {
	char ch = st.charAt(i);
	if(ch>=65 && ch >=90) {
		lower=lower+ch;
	}else {
		upper=upper+ch;
	} 
}
System.out.println("upper : " + upper);
System.out.println("lower : " + lower);
      
      
//      char a = 98;
//      System.out.println(a);


// today's lesson

// remove range
//List<String> lst = new ArrayList();
//lst.add("ahmad");
//lst.add("khan");
//lst.add("jan");
//lst.add("kamal");
//lst.add("zabi");
//lst.add("ajmal");
//lst.add("akmal");
//lst.add("ahmad");


//lst.removeRange(1,5);
//lst.ensureCapacity(200); // extends 200 places

// Collections
//sorting  -- a to z sort
//Collections.sort(lst);
//System.out.println(lst);


// sort -- z to a sort
//Collections.sort(lst,Collections.reverseOrder());
//System.out.println(lst);

//ArrayList<Integer> numbers = new ArrayList();
//numbers.add(200);
//numbers.add(100);
//numbers.add(500);


//System.out.println(Collections.max(numbers));
//System.out.println(Collections.min(numbers));

// copy
// 1. addAll()
//ArrayList copyLst = new ArrayList();
//copyLst.addAll(lst);
//System.out.println(copyLst);
// 2. constructor
//ArrayList copyLst = new ArrayList(lst);
//System.out.println(copyLst);

// replace
// some elements
//Collections.replaceAll(lst, "ahmad", "yyy");
//System.out.println(lst);
// replace all
//Collections.fill(lst, "yyy");
//System.out.println(lst);


// Exception -- Errors
//System.out.println(20/0);
//int[] x = {10,20};
//System.out.println(x[24]);

//String s = "123$";
//int y = Integer.parseInt(s);
//System.out.println(y);

//try {
//  Scanner scan = new Scanner(System.in);
//  System.out.println("enter number 1");
//  int n1 = scan.nextInt();
//  System.out.println("enter number 2");
//  int n2 = scan.nextInt();
//  
//  System.out.println(n1/n2);
//}
//catch(Exception a ){
//  a.printStackTrace();
//  System.out.println("divide zero impossible");
//}

// List
  // ArrayList()
  // LinkedList()
//  LinkedList lst1 = new LinkedList();
//  lst1.add("ahmad");
//  lst1.add("khan");

//  LinkedList lst1 = new LinkedList(lst);
//  System.out.println(lst1);



  long start = System.currentTimeMillis();
  LinkedList test = new LinkedList();
  for (int i = 0; i < 100000000; i++) {
          test.add(i);
  }
  System.out.println(test.get(97000));
  test.remove(917800);
  long end = System.currentTimeMillis();
  System.out.println(end - start);
  // reading assignment
  // Vector, Stack
// Set
// Map

  
  
  
  
}

// ascii code
// A = 65



}
