import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("DB 점수: ");
		int num1=sc.nextInt();
		System.out.print("전자계산기 점수: ");
		int num2=sc.nextInt();
		System.out.print("데이터통신 점수: ");
		int num3=sc.nextInt();//근근웹
		System.out.print("소프트웨어공학 점수: ");
		int num4=sc.nextInt();
		System.out.print("OS 점수: ");
		int num5=sc.nextInt();
		
		int sum=num1+num2+num3+num4+num5;
		
		if(sum>=60 && num1>=12 && num2>=12 && num3>=12 && num4>=12 && num5>=12) {
		System.out.println("합격입니다");
//		if(age%3==0 &&  age%5==0) {
//		System.out.println("난 5와 3의 배수여!!");
//		}else {
//			System.out.println("아니지롱!!");
//		}
	}else {
		System.out.println("불합격입니다");
		}
	}
		
		

}
