import java.util.Scanner;

public class ex05 { 
	//=====================반복문===================================
	public static void main(String[] args) {
		
		//1. 일정 횟수 반복(1~100) : for
		//2. 사용자가 입력한 지점까지 반복: while

		//초기변수
	/*	int i=0;
		int sum=0;
		while(i<=100) {
			
			sum+=i;
			i++;
			
		}
		System.out.println(sum); */
		Scanner sc=new Scanner(System.in);
		
		/*
		 * while(true) { int num=sc.nextInt(); System.out.println("사용자가 입력한 수:: "+num);
		 * if(num==0) { System.out.println("종료"); break; } }
		 */
		
//		while(true) {
//			System.out.println("정수입력:  ");
//			int n=sc.nextInt();
//			if(n>=10) {
//				System.out.println("종료");
//				break;
//			}
//		}
		int odd=0; //홀
		int even=0; //짝
		while(true) {
		System.out.println("숫자입력:  ");
		
		for(int i=0; i<5; i++){
			int n=sc.nextInt();
			
			if(n%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("홀수의 개수는: "+odd+"\n짝수의 개수는: "+even);
		break;
		}
			
		
	}
	}
		

