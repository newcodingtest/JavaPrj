import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       
       int result=0;
       
       while(true) {
    	   for(int i=1; i<5; i++) {
    		   System.out.println(i+"��° �����Է�");
    		   int num=sc.nextInt();
    		   
    		   if(num<0) {
    			   System.out.println("������Ѷ� " );
    			   break;
    		   }
    		   
    		   System.out.println(num+"�� �Է��Ͽ����ϴ�");
    		   result+=num;
    		   System.out.println("���� ��: "+result );
    		
    	   }
    	   break;
    	
    	   
    
        
	}

	}
}
	