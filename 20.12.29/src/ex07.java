import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
		int result=0;
		
		Scanner sc=new Scanner(System.in);

		System.out.print("현재몸무게:  ");
		int n=sc.nextInt();
		System.out.print("목표몸무게:  ");
		int n_=sc.nextInt();
		
		/*
		 * System.out.print("1주차 감량 몸무게:  "); int n1=sc.nextInt();
		 * System.out.print("2주차 감량몸무게:  "); int n2=sc.nextInt();
		 * System.out.print("3주차 감량몸무게:  "); int n3=sc.nextInt();
		 * System.out.print("4주차 감량몸무게:  "); int n4=sc.nextInt();
		 */
		
		while(true) {
			for(int i=1; i<6; i++) {
			System.out.print(i+"주차 감량 몸무게:  ");
			
			int min=sc.nextInt();
			result+=min;
			
		}
		if((n-result)<=70) {
		System.out.println(n-result+"달성!! 축하");
		break;
		}else {
			System.out.println("그만 먹고 좀더 빼라");
			break;
		}
	}

	}
}