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
          System.out.print((i)+1+"��° �Է�>>");
     
          arr[i]=sc.nextInt();  
          
          if(arr[i]>max) {
        	  max=arr[i];
          }
          else if(arr[i]<min) {
        	  arr[i]=min;
          }
         sum+=arr[i];
		 }
		
		 System.out.println("�Էµ� ����:"+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		 //System.out.println("�Էµ� ����:"+Arrays.toString(arr));
		 System.out.println("�ִ밪��"+max);
		 System.out.println("�ּҰ���"+min);
		 System.out.println("����� ����"+sum);
		 System.out.println("��հ���"+sum/(arr.length));
		
		
	}

}
