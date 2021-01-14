import java.util.Random;
import java.util.Scanner;

public class ex03ArrayLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr[]= {1,2,3,4,5};
		
		System.out.println(arr.length);
		
		int arr2[]=new int[10];
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=sc.nextInt();
					}
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		
		Random rnum=new Random();
		
		int r_num=rnum.nextInt(100)+1;
		int r_num1=rnum.nextInt(100)+1;
		int r_num2=rnum.nextInt(100)+1;
		int r_num3=rnum.nextInt(100)+1;
		
		int qst[]=new int[10];
		
		int cnt=0;
		
		for (int j = 0; j < qst.length; j++) {
			
			if(r_num%2!=0) {
				qst[j]=r_num;
				cnt++;
			}else if(r_num1%2!=0) {
				qst[j]=r_num1;
				cnt++;
			}else if(r_num2%2!=0) {
				qst[j]=r_num2;
				cnt++;
			}
			else if(r_num3%2!=0) {
				qst[j]=r_num3;
				cnt++;
			}

			
		}
		System.out.println("È¦¼ö´Â"+(r_num)+(r_num1)+(r_num2)+(r_num3)+"ÀÌ¸ç ÃÑ"+cnt+"°³");
		
		
		
		
		
		
		
		
	}

}
