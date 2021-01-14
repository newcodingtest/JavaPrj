


public class ex03 { //1~100의 사이에서  3과 5의 배수를 구하여라

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

  
    	  System.out.println("3의배수는"+sam+"\n5의배수"+oh);
}
}
    
