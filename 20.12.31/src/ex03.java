


public class ex03 { //1~100�� ���̿���  3�� 5�� ����� ���Ͽ���

    public static void main(String[] args) {
    	
    	int sam=0;
    	int oh=0;
    	int result3=0;
    	int result5=0;
    	
      for(int i=1; i<=100; i++) {
    	 
    	  if(i%3==0) {
        	 sam++;
          }
    	  
    	  if(i%5==0 ) {
        	 oh++;
          }
    	  
      }

  
    	  System.out.println("3�ǹ����"+sam+"\n5�ǹ��"+oh);
}
}
    
