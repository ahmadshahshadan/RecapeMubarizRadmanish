package logicQuestion;
import java.lang.reflect.Array;
import java.util.*;
public class LogicQuestion {
	
	public static void main(String[] args) {
		
//		String me = "ooo ";
//		for (int i = 39 ; i <= 60; i++) {
//			if (i%4 == 0 && i%6 == 0) {
//				me += "SharifShadan";
//			}else if (i%4 == 0) {
//				me += "Sharif";	
//			}else if (i%6 == 0) {
//				me+= " Shdan";
//			}else {
//				me +=  i;
//			}
//		}
//	 
//			System.out.println(me);
		
		
		
//		----------------------------------
//		 String s ="";
//		  for (int i = 0; i <=30;i++) {
//			  
//			 
//			  if (i%3 == 0 && i%5 ==0) {
//				  s += " FINRA";
//			  }else if (i%3 ==0) {
//				  s += " FIN";
//			  }else if (i%5 == 0) {
//				  s += " Ra";
//			  }else {
//				 s += i;
//			  }
//		  }
//		  System.out.println(s);
//		-------------------
		

//         String m = "khaaHK";
//         
//         String n = "Shanor";
//         String rm = new StringBuffer(m).reverse().toString();
//		if(m.equals(rm)) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("Not Palindrome");
//		}
//		String s = "Ahamd";
//		String rs = new StringBuffer(s).reverse().toString();
//		if (s.equals(rs)) {
//			System.out.println("Palindrome");
//			
//		}else {
//			System.out.println("No Palindrome");
//		}
      
//		String kh = "naan";
//		String rkh = new StringBuffer(kh).reverse().toString();
//		System.out.println((kh.equals(rkh))? "Palindrome":"No Palindrome");
		
		
//		String k = "naan";
//		String rk = new StringBuffer(k).reverse().toString();
//		System.out.println((k.equalsIgnoreCase(rk))? "pali": "No Pali");
		
		
//---------------------	
//		 Write a program that will find the java word from a string
//		 
//		String jav = "Kac de defa java geceiyok ki java de sayde de isini javada  de javajjjjjddjava";
//		
//		int j = 0;
//		int  jj = 0;
//		for (int i = 0; i<jav.length()-3; i++) {
//			if (jav.substring(i, i+4).equalsIgnoreCase("java")){
//			j++;
//		}
//			else if(jav.substring(i, i+2).equalsIgnoreCase("de")){
//				jj++;
//			}
//			}
//		System.out.println(j);
//		System.out.println(jj);
		
//		int count1 = 0;
//		int count = 0;
//		for (int i = 0; i<jav.length()-3; i++) {
//			if (jav.substring(i, i+4).equalsIgnoreCase("java")) {
//				
//			
//		    count++;
//			}else if (jav.substring(i, i+2).equalsIgnoreCase("de")) {
//				count1++;
//			
//		}
//		}
//		    System.out.println(count); 
//		    System.out.println(count1);
		
//		String givenStr = "Kac defa java geceiyok ki java sayisini javada say";
//		int counter = 0;
//		for (int i = 0; i<givenStr.length()-3; i++){
//		if(givenStr.substring(i, i+4).equalsIgnoreCase("java"))
//		counter++; }
//		System.out.println(counter);
//		-----------------------------------
// Write a program which returns even numbers only
        
////         List<Integer> numbers = new ArrayList<Integer>(Arrays.asList ( 1 , 2 , 5 , 343 , 12 , 6 , 8 , 9 , 34 , 53 ));
//         List <Integer> numbers= new ArrayList <Integer> (Arrays.asList(3,4,7,8,9,10,13,44,55,88));
//     
//        for (int i = 0; i < numbers.size(); i++) {
//            if(numbers.get(i) % 2 == 0){
//                System.out.println(numbers.get(i));
////            }else if (numbers.get(i)% 2 == 1) {
//            	
//            	
//            }
//           
////            System.out.println(numbers.get(i));
//        }
        
//         System.out.println((numbers));
     
		
//	-------------------------------------
	
//    // How to remove names which contain a speciﬁc letter “e” from a collection type?
//		String []name = {"Shah", "Jahan", "Shir"};
//		Set<String> nam = new LinkedHashSet<>();
//		nam.addAll(Arrays.asList(name));
//		Iterator y = nam.iterator();
//		while (y.hasNext()) {
//		String sh = y.next().toString();
//		if (sh.contains("a")) {
//			y.remove();
//		}
//		}
//		System.out.println(nam);
//		
//		String [] name = {"Ahmad" , "Shah", "Shir", "Shakir", "shiba", "shila"}; 
//		Set <String>namelist = new LinkedHashSet<>();
//		namelist.addAll(Arrays.asList(name));
//		System.out.println(namelist);
//		Iterator x = namelist.iterator();
//		while (x.hasNext()) {
//			String s = x.next().toString();
//			if(s.contains("i")) {
//			
////			x.remove();
//		}
//		}
////		System.out.println(namelist);
//		
//    String[] namesArray = { "Ali" , 
//        "Veli" , "Semavi" , 
//        "Sami" , "Hayati" , "Memati" , 
//        "Canan" };
//    
//    Set<String> namesSet = new LinkedHashSet<>();
//    namesSet.addAll(Arrays.asList(namesArray));
//    
//   System.out.println(namesSet);
//
//    Iterator<String> x = namesSet.iterator();
//    while(x.hasNext()){
//        System.out.println(x.next());
//         String s = x.next().toString();
//         
//         if(s.contains("e")){
////             namesSet.remove(s);
//              x.remove();
//         }
//    }
//    
//    System.out.println(namesSet);
//
//
}
}