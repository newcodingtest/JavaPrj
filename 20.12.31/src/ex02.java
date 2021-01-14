import java.util.Random;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		// while: 야구게임(조건문/누적/랜덤변수)
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 정수 입력 >> ");
		int n1=sc.nextInt();
		
		System.out.print("두번째 정수 입력 >> ");
		int n2=sc.nextInt();
		
		System.out.print("세번째 정수 입력 >> ");
		int n3=sc.nextInt();
		
		if((n1>n3 && n1<n2) || (n1>n2) &&(n1<n3)) {
			System.out.println(n1);
		}else if((n2>n3 && n2<n1)||(n2>n1 && n2<n3)){
			System.out.println(n2);
		}else if(n1==n2 || n1==n3) {
			System.out.println(n1);
			
		}else if(n1==n2 || n2==n3) {
			System.out.println(n2);
		}
		else if(n2==n3 ||n1==n3) {
			System.out.println(n3);
		}
		
		else if(n1==n2 &&n2==n3 && n3==n1){
			System.out.println(n1);
		}
		
		

	}

}
