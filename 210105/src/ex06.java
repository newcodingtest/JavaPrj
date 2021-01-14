import java.util.Arrays;
import java.util.Scanner;

import java.util.Arrays;

public class ex06 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

		int arr[]=new int[5];
		
		int max=arr[0];
		int min=10;
		int sum=0;

		 for(int i=0; i<arr.length; i++) {
          System.out.print((i)+1+"번째 입력>>");
     
          arr[i]=sc.nextInt();  
          
          if(arr[i]>max) {
        	  max=arr[i];
          }
          else if(arr[i]<min) {
        	  arr[i]=min;
          }
         sum+=arr[i];
		 }
		
		 System.out.println("입력된 점수:"+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		 //System.out.println("입력된 점수:"+Arrays.toString(arr));
		 System.out.println("최대값은"+max);
		 System.out.println("최소값은"+min);
		 System.out.println("모두의 합은"+sum);
		 System.out.println("평균값은"+sum/(arr.length));
		
		
	}

}
