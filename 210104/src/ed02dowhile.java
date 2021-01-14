import java.util.Random;
import java.util.Scanner;

public class ed02dowhile {

	public static void main(String[] args) {
		
//do-while문 문법
		Scanner sc=new Scanner(System.in);
		System.out.println("====1부터 100사이 숫자 맟추기 게임====");
		Random rnum=new Random();
		int n1=rnum.nextInt(100)+1;
		
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요 >>");
			int n=sc.nextInt();
			if(n==n1) {
				System.out.println("정답입니다.");
				break;
			}else if(n>n1) {
				System.out.println("더 작은수로 다시하세요");
			}else if(n<n1) {
				System.out.println("더 높은수로 다시하세요");
			}
			
		}while(true);
	}

}
