import java.util.Scanner;

public class ex04 { //자판기

	public static void main(String[] args) { //n::금액  n1:제품종류
	    int money;
	    
		int col=800;
		int water=500;
		int vita=1500;
		
		
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("=================================\n금액을 입력하세요:  ");
		money=sc.nextInt();
		
		if(money<500) {
			System.out.println("=================================\n금액이 부족하다 다시입력해라:  ");
			money=sc.nextInt();
		}
		
	
		System.out.println("메뉴를 고르세요 \n "
				+ "1.콜라(800원)  2.생수(500원)  3.비타민워터(1500원)\n========================" );
		
		int choice=sc.nextInt();
		int num=0;
	
		
		switch (choice) {
	
		case 1: 
			
			num=money-800;
			System.out.println("콜라를 선택하셨습니다\n로딩중...");
			System.out.println("=================================\n나머지 잔돈은"+(money-col)+"원 입니다");
		
			break;
			
		case 2: 
			num=money-500;
			System.out.println("생수를 선택하셨습니다\n로딩중...");
			System.out.println("=================================\n나머지 잔돈은"+(money-water)+"원 입니다");
			;
			break;
			
		case 3: 
			num=money-1500;
			System.out.println("비타민워터를 선택하셨습니다\n로딩중...");
			System.out.println("=================================\n나머지 잔돈은"+(money-vita)+"원 입니다");
			
			break;
			
		default:
			System.out.println("다시 입력해주세요");
			
		}
		int Cwon=(num)/1000;
		int Owon=(num)%1000/500;
		int Bwon=(num)%1000%500/100;
		
		System.out.println("천원"+Cwon+"\n오백원"+Owon+"\n백원"+Bwon);;
		}
		}
		}
		

		




