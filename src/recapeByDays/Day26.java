package recapeByDays;

import java.util.Arrays;

public class Day26 {
	
	public static void main(String[] args) {
		
		int [] kh = {9,6,8,900,2,5,7,90};
		
//		for (int i = 0; i<kh.length;i++) {
//			for (int j =0; j<kh.length;j++) {
//				 int tem = 0;
//				 if(kh[i]> kh[j]) {
//					 tem = kh[i];
//					 kh[i]= kh[j]; 
//					 kh[j]= tem;
//				 }
//			}
//		}
//		
//		System.out.println(Arrays.toString(kh));
//		System.out.println(kh[0]);
//		 more intformation about changing of the values --> changing of the value of x to y and y to x
//		int x = 5;
//		int y = 10;
//		x = y ;
//		y = x;
//		System.out.println(x);
//		System.out.println(y);
		for (int i  = 0 ; i<kh.length; i++) {
			for (int j = 0; j<kh.length; j++) { 
				int temp = 0;
				if (kh[i] < kh[j]) {
					temp = kh[i];
					kh[i] = kh[j];
					kh[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(kh));
		System.out.println(kh[0]);
		System.out.println();
		
		
		
	}

}
