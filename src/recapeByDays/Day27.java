package recapeByDays;

public class Day27 {
	
	public static void main(String[] args) {
		
		
		
		for (int i = 4; i>=0;i--) {
			for (int j = 0; j<i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		for (int i = 1;i<=6;i++) {
			for (int j =1; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
//		
		for (int i = 4; i>=1;i--) {
			for(int k = 1; k<=i; k++) {
				System.out.print("8 ");
			}
			System.out.println(""); 
		}
//		
//		int a = 4;
		for (int i = 1; i<=4;i++) {
			for(int j = 1; j<= i; j++) {
				System.out.print("8 ");
				
			}
			System.out.println("");
		}
//		
		
//		Swap two variable value without using a third variable
//		int x = 20;
//		int y = 15;
//		 x = x+y;
//		 x = x-y;
//		 y = x-y;
//		 
//		 System.out.println(x);
//		 System.out.println(y);
//		 
		
		
//	find the number that can divide for 3, 5 and 15
//	  int for15 = 0;
//	  int for5 = 0;
//	  int for3 = 0;
//	  int forOther = 0;
//	for (int i = 1; i<=100; i++) {
//		if (i % 3 == 0 && i % 5 == 0) {
//			System.out.println(i +" Divide for 15 " );
//			for15++;
//		}else if (i %5 == 0) {
//			System.out.println(i+" Divied for 5 ");
//			for5++;
//		}else if (i % 3 == 0) {
//			System.out.println(i+" Divide for 3 ");
//			for3++;
//		}else {
////			System.out.println("for other ");
//			forOther++;
//		}
//	}
//	System.out.println("count15 " +for15);
//	System.out.println("count5 " +for5);
//	System.out.println("count3 " +for3);
////	System.out.println("other " + forOther);
//		var a = 10.4;
////		var a = "AHmad";
//		System.out.println(a);
	}
}
