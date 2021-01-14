
public class ex03calculator4 {

	

	public static void main(String[] args) {

//		add(3, 5);
//		sub(3, 5);
//		div(3, 5);
//		mul(3, 5);
//		
//
//	}
//	
//	public static void add(int a, int b) {
//		System.out.println(a+b); 
//	}
//	public static void sub(int a, int b) {
//		System.out.println(a-b); 
//	}
//	public static void div(int a, int b) {
//		System.out.println(a/b); 
//	}
//	public static void mul(int a, int b) {

//		System.out.println(a*b); 
		
		   int a=50;
	 		int b=15;
	 		char c='*';
	 		
	 		cal(a,b,c);
  				
		}	
	public static void cal(int a, int b, char c) {
//      if(c=='+') {
//     	 System.out.println(a+b);
//     	 }else if(c=='-') {
//         	 System.out.println(a-b);
//         	 }else if(c=='/') {
//             	 System.out.println(a/b);
//             	 }else if(c=='*') {
//                 	 System.out.println(a*b);
//             	 }
		int result=0;
		switch(c) {
		
	       case '+': 
				result=a+b;
				System.out.println(result);
				break;
				
	      
			case '-': 
				result=a-b;
				System.out.println(result);
				break;
			
				
			case '*':
				result=a*b;
				System.out.println(result);
				break;
			
				
			case '/':
				result=a/b;
				System.out.println(result);
				break;
	      
		
		}
	}
  
}
