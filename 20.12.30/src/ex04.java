
import java.util.Scanner;



public class ex04 {

	public static void main(String[] args) {
      /* int result=0;
		for(int i=1; i<=100; i++) {
			result=++i;
			System.out.println(result);*/
		
		/*
		 * int sum=0;
		 * 
		 Scanner sc=new Scanner(System.in);
		  System.out.print("정수 입력: "); int
		 * n=sc.nextInt();
		 * 
		 * for(int i=1; i<=n; i++) { sum+=i; } System.out.println("1부터 100까지의 합: "+sum);
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 수를 입력: ");
		int n1=sc.nextInt();
		System.out.println("두번째 수를 입력: ");
		int n2=sc.nextInt();
		
		if(n1>n2) {
			System.out.println("첫번째 수가 큰수입니다");
		for(int i=n2; i<=n1; i=i+1) {
			
			System.out.print(i+"  ");
		}
		
		}
		else if(n2>n1) {
			System.out.println("두번째 수가 큰수입니다");
		for(int i=n1; i<=n2; i=i+1) {
			
			System.out.print(i+"  ");
		
		}
		
	
		}
	
		
	}
}

		
		
		
	


