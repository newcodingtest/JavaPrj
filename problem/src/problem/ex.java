package problem;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][]arr=new int[n][n];
		int start=0;
		int end=5;
		int cnt=1;
		
		for (int i = start; i<arr.length; i++) {
			if(i%2==0) {
			for (int j = 0; j<arr.length; j++) {
				arr[i][j]=cnt++;
			}
			}else {
				for(int j=arr.length-1; j>=0; j--) {
					arr[i][j]=cnt++;
				}
			}
			
		}
		
		for (int i = 0; i <arr.length; i++) {
		for (int j = 0; j <arr.length; j++) {
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
			
		}

	}

}
//     Random rnum=new Random();
//     
//    int[] arr=new int[6];
//    
//    for (int i = 0; i < arr.length; i++) {
//		arr[i]=rnum.nextInt(99)+1;
//		for (int j = 0; j < i; j++) {
//			if(arr[i] == arr[j]) {
//				i--;
//				break;
//				
//			}
//		}
//		
//	}
//    for(int i=0; i<arr.length; i++) {
//    System.out.println("행운의숫자: "+arr[i]);
//    }