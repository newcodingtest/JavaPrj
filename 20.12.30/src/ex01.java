import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       
       int result=0;
       
       while(true) {
    	   for(int i=1; i<5; i++) {
    		   System.out.println(i+"번째 정수입력");
    		   int num=sc.nextInt();
    		   
    		   if(num<0) {
    			   System.out.println("종료시켜라 " );
    			   break;
    		   }
    		   
    		   System.out.println(num+"을 입력하였습니다");
    		   result+=num;
    		   System.out.println("누적 합: "+result );
    		
    	   }
    	   break;
    	
    	   
    
        
	}

	}
}
	