import java.util.Random;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		// while: 야구게임(조건문/누적/랜덤변수)
		
		int result=0;
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		
		System.out.println("연산게임>> 게임을 선택하세요");
		System.out.println("1.더하기  2.빼기  3.곱하기  4.나누기");
		int n=sc.nextInt();
		int ran_num1=ran.nextInt(10)+1;
		int ran_num2=ran.nextInt(10)+1;
		
		
		switch (n) {
		case 1: 
			
			System.out.println("더하기를 선택하셨습니다");
			System.out.println(ran_num1+"+"+ran_num2+'=');
			result=(ran_num1+ran_num2);
			break;
        case 2: 
			
			System.out.println("빼기를 선택하셨습니다");
			System.out.println(ran_num1+"-"+ran_num2+'=');
			result=(ran_num1-ran_num2);
			break;
		case 3:

			System.out.println("곱하기를 선택하셨습니다");
			System.out.println(ran_num1+"*"+ran_num2+'=');
			result=(ran_num1*ran_num2);
			break;
		case 4:

			System.out.println("나누기를 선택하셨습니다");
			System.out.println(ran_num1+"/"+ran_num2+'=');
			result=(ran_num1/ran_num2);
			break;
			
	
		}
		int n1=sc.nextInt();
		if(result==n1) {
		System.out.println("정답입니다");
		}else {System.out.println("틀렸습니다");}
			

	}

}
