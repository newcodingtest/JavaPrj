import java.util.Scanner;

public class ex01_review {

	public static void main(String[] args) {
	 /*Scanner sc=new Scanner(System.in);
	 
	 int num=sc.nextInt();
	 System.out.println("사용자가입력한정수:"+num);
	 */
		
		System.out.println("몇명인가요?");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("총금액은 얼마인가요?");
		int num2=sc.nextInt();
		System.out.println("각자 지불해야할 금액은"+num2/num1+ "원 입니다");
		
	 

	}

}
