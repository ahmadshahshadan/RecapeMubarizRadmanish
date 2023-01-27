package recapeByDays;

public class Day4 {
	public static void main(String[] args) {
	    // LOOP
	    // start value
	    // condition
	    // incr/decr
	    
////		while loop
//		String a = "she";
//		while (a == "she") {
//			a += " is good girl";
//		
//			System.out.println(a);
//		}
//			int b = 12;
//			while (b < 20) {
//				b +=5;
//				System.out.println(b);
//			
//		}
		
//	        int i = 12;
//	        while(i < 5){
//	            i++;
//	            System.out.println("hello");
//	        
//	         
//	        } 
// 
//	    // 3. do while
		
//	        int im = 13;
//	        do {
//	            System.out.println("Hello");
//	            i++;
//	        }while(im < 5);

	// Array
//		int [] c = {100,3,4,8,200};
////		System.out.println(c[2]);
//		for (int i = 0; i<c.length; i++) {
//		}
//		System.out.println(c[3]);
//		System.out.println(c.length);
	// a. same data type
//	 100,200,300,400
//	int[] listSalaries = {100,200,300,400,500,555,666};
//	               //  0   1   2   3 // index
//	        int x = listSalaries[4];
//	        System.out.println(x);
//
////	        System.out.println(listSalaries[0]);
////	        System.out.println(listSalaries[1]);
////	        System.out.println(listSalaries[2]);
////	        System.out.println(listSalaries[3]);
//
//	// Iterate or loop
//
//	        System.out.println(listSalaries.length);
//	        for (int i = 0; i < listSalaries.length; i++) {
//	            System.out.println(listSalaries[i]);
////	        }

//	        int[] listSalaries = {100,200,300,400,500,555,666,200,400};
//	        
//	        for (int i = 0; i<listSalaries.length;i++) {
//	        	if (listSalaries[i] == 200) {
//	        		System.out.println("Yes found " + i);
//	        	}
//	        for (int i = 0; i < listSalaries.length; i++) {
//	            if(listSalaries[i] == 400){
//	                System.out.println("Yes, Found in index : " + i); 
//	            }
//	        }
//
//	int[] listSalaries = {100,200,300,400,500,555,666};
//
//	// access array element
//	System.out.println(listSalaries[2]);
//
////	listSalaries[10] = 120;
//	    for (int i = 0; i < listSalaries.length; i++) {
//	            System.out.println(listSalaries[i]);
////	        }
//	    }
		

	    // NESTED loop
////	        for (int i = 1; i <= 4; i++) {
////	            for (int j = 1; j <= 3; j++) {
////	                System.out.print("Hello ");
////	            }
////	            System.out.println("");
////	        }
////		
//		for (int i = 0; i<4 ; i++) {
//			for(int b = 0; b<4; b++) {
//				
//				System.out.print("  &");	
//			}
//			
//			System.out.println("");
//		}
		
	    // 0 0 0 0
	    // 0 0 0 0
	    // 0 0 0 0
	        	
	     
	    // outer loop rows
	    // inner loop columns
	        for (int i = 1; i <= 3; i++) {
	            for (int j = 1; j <= 4; j++) {
	                System.out.print("* ");
	            }
	            System.out.println("");
	        }
	        
	// 2d array
	//int[][] x = {
//	    {10,20}, // 0
	//   // 0  1
//	    {22,44}  // 1
	//   // 0  1
	//};
		
//		 array with nested forloop
//		int [][] k = {{1,3}, {4,6}};
//       for (int i = 0; i<k.length;i++) {
//    	   for (int l = 0; l<2;l++) {
//    		   System.out.println(k[l][i]); 
//    	   }
//    	   System.out.print(k[0][1]);
//       }
		
//		String [][] st =  {{"Ahmad","Khan"},{"Jan","Khano"}};
//		for (int i = 0 ; i<st.length;i++) {
//			for (int j = 0; j< st.length;j++) {
//			
//			System.out.println(st[i][j]);}
//		}
	
//	String[][] names =  {{"Ahmad","Khan"},{"Jan","Khano"}};
//	      //  System.out.println(names[1][1]);
//	        for (int i = 0; i < names.length; i++) {
//	            for (int j = 0; j < 2; j++) {
//	                System.out.println(names[i][j]);
//	            }
//	        }
//   
	// Hotel
	// 2 rooms
	// each room a family of 2 persons
	        int[][] hotel = {{10,30},{50,60}};
//	            //      0       1
//	            //    0   1   0   1
//	        System.out.println(hotel[1][1]);
//	            System.out.println(hotel[0][0]);
//	            System.out.println(hotel[0][1]);
//	            System.out.println(hotel[1][0]);
//	            System.out.println(hotel[1][1]);

	    // System.out.println(hotel);
//	    for (int i = 0; i <= 1; i++) {
//	       for (int j = 0; j <= 1; j++) {
////	            System.out.println(hotel[i][j]);
//	        }
//	         System.out.println(hotel[i]);
	    }
	}



