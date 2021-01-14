import java.util.Scanner;

public class ex019x9STAR {

	public static void main(String[] args) {

         //                          while vs for
		 //[while] : 반복횟수를 정확히 알지 못할때       vs      [for] : 반복횟수를 정확히 알때 
		 
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("단수입력");
//		int n=sc.nextInt();
//		System.out.println("어느 수까지 출력:");
//		int n1=sc.nextInt();
//		
//		int result=0;
//		
//		for(int i=n; i<=n; i++) {
//			for(int j=1; j<=n1; j++) {
//				System.out.println(i+"x"+j+"="+(i*j));
//				
//			} 
//			
//		}
		
	 // [1]
//		* 
//		** 
//		*** 
//		**** 
//		***** 
//		****** 
//		******* 
		
	
//          for(int i=0; i<8; i++) {
//        	for(int j=0; j<i; j++) {
//        		System.out.print("*");
//        	}
//        	System.out.println(" ");
//        }
		
//        System.out.println();
        // [2]
//		******** 
//		******* 
//		****** 
//		***** 
//		**** 
//		*** 
//		** 
//		* 

//        for(int i=0; i<8; i++) {
//        	for(int j=8; j>i; j--) {
//        		System.out.print("*");
//        	}
//        	System.out.println(" ");
//        }
//        System.out.println();
						
//		******
//		******
//		******
//		******
//		******

//		for(int i=0; i<5; i++) {
//			System.out.print("*");
//			for (int j=0; j<5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		[3]
//		*       
//		**      
//		***     
//		****    
//		*****   
//		******  
//		******* 
//		********
//	
////		for(int i=0; i<8; i++) {
//     	 for(int j=8; j>i; j--) {
//     		System.out.print(" ");
//     	}
//     	 System.out.println();
//     	for(int j=0; j<=i; j++) {
//     	System.out.print("*");
//     	}
//    
//		}
		
//		 
//		 [4]
//		         *
//	            **
//	           ***
//	          ****
//	         *****
//	        ******
//	       *******
		

//      for(int i=0; i<8; i++) {
//      	for(int j=8; j>i; j--) {
//      		System.out.print(" ");
//      	}
//      	for(int j=0; j<=i; j++) {
//      	System.out.print("*");
//      	}
//      	System.out.println();
//      }
//    
	
		
		 for(int i=0; i<=5; i++) {
			 for(int j=5; j>=i; j--) {
				 System.out.print(" ");
			 }

				for(int j=1; j<=i*2+1; j++) {
					System.out.print("*");
				}
				System.out.println();
		 }
		 
		 for(int i=0; i<=6; i++) {
			 
		   for(int j=0; j<=i-1; j++) {
			 System.out.print(" ");
		 
		   }
		   
		 for(int j=13; j>=i*2+1; j--) {
			 System.out.print("*");
		 }	
		System.out.println();
	     
	}
		
		 
	}
	}
	

		


		
	
		
			
	

