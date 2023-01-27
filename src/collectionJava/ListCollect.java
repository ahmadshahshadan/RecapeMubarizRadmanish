package collectionJava;
import java.util.*;

public class ListCollect {
	
	public static void main(String[] args) {
		
//	 Show  the duplicate of  a word in the arraylist 
//	1-	Make object/Initialize an ArrayList 
//	2- Than add values to the ArrayList
//	3- you forloop and nested if statement for explaining of the condition 
		
		ArrayList dpul = new ArrayList();
		
		dpul.add("Shah");
		dpul.add("Khan");
		dpul.add("Gul");
		dpul.add("Shah");
		dpul.add("Khan");
		dpul.add("Gul");
		dpul.add("Shah");
		dpul.add("Khan");
		dpul.add("Gul");
		dpul.add("Khan1");
		dpul.set(6, "Gul");
		
		System.out.println(dpul);
		
		dpul.remove(5);
		dpul.remove(0);
//		dpul.remove(100);// we have not index of 100 therefore it will throw an exception
//		dpul.clear();
		dpul.indexOf(dpul);

		System.out.println(dpul.size());
		
		dpul.set(3, "GullaJan");
		dpul.contains("Gul");
		
		System.out.println(dpul.indexOf("GullaJan"));
		System.out.println(dpul.indexOf("Khan"));
		System.out.println(dpul.contains("Khan"));
		System.out.println(dpul.contains("Khanoo"));
		System.out.println(dpul);
         int count =0;
		for (int i = 0; i < dpul.size(); i++) {
			if(dpul.get(i) == "Gul") {
				count++;
			}
			
		}
		System.out.println(count);
		if (count > 1) {
			System.out.println("Diplucate Value");
		}else {
		System.out.println("No Diplucate");
		}
		System.out.println(dpul.isEmpty());		//		int count = 0;
//		for (int i = 0; i < dpul.size(); i++) {
//			if (dpul.get(i) == "Khan"){
//				
//				count++;
////				count--;	
//			}
//		}
//		System.out.println(count);
//		if(count > 1) {
//			System.out.println("Yes Diplucate ");
//		}
//		else {
//			System.out.println("No Diplucate");
//		}
//		ArrayList lst = new ArrayList();
//		
//	    lst.add("Ahmad");
//        lst.add("Khan");
//        lst.add(2);
//        lst.add("Jan");
//        lst.add(3.5);
//        lst.add("Jan1");
//        lst.add("Ahmad");
//        lst.add("Jan");
        
//        System.out.println(lst);
//           int list = 0;
//        for (int i = 0; i < lst.size(); i++) {
//        	if (lst.get(i) == "Jan") {
//        		list++;
//        	}
//        }
//        System.out.println(list);
//        if (list >1) {
//        	System.out.println("Yes Diplucate ");
//        }else {
//        	System.out.println("No diplucate");
//        }
        
        
//      int count = 0;
//   for (int i = 0; i < lst.size(); i++) {
//   	if (lst.get(i).equals("Ahmad")) {
//   		count++;
//   	}
//   }
//   System.out.println(count);
//   if (count >1) {
//   	System.out.println("Yes Diplucate ");
//   }else {
//   	System.out.println("No diplucate");
//   }

	}

}
