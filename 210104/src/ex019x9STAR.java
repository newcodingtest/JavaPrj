import java.util.Scanner;

public class ex019x9STAR {

	public static void main(String[] args) {

         //                          while vs for
		 //[while] : �ݺ�Ƚ���� ��Ȯ�� ���� ���Ҷ�       vs      [for] : �ݺ�Ƚ���� ��Ȯ�� �˶� 
		 
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("�ܼ��Է�");
//		int n=sc.nextInt();
//		System.out.println("��� ������ ���:");
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
	

		


		
	
		
			
	

