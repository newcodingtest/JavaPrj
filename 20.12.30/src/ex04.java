
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
		  System.out.print("���� �Է�: "); int
		 * n=sc.nextInt();
		 * 
		 * for(int i=1; i<=n; i++) { sum+=i; } System.out.println("1���� 100������ ��: "+sum);
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ù��° ���� �Է�: ");
		int n1=sc.nextInt();
		System.out.println("�ι�° ���� �Է�: ");
		int n2=sc.nextInt();
		
		if(n1>n2) {
			System.out.println("ù��° ���� ū���Դϴ�");
		for(int i=n2; i<=n1; i=i+1) {
			
			System.out.print(i+"  ");
		}
		
		}
		else if(n2>n1) {
			System.out.println("�ι�° ���� ū���Դϴ�");
		for(int i=n1; i<=n2; i=i+1) {
			
			System.out.print(i+"  ");
		
		}
		
	
		}
	
		
	}
}

		
		
		
	


