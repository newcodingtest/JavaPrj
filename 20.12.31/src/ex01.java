import java.util.Random;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		// while: �߱�����(���ǹ�/����/��������)
		
		int result=0;
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		
		System.out.println("�������>> ������ �����ϼ���");
		System.out.println("1.���ϱ�  2.����  3.���ϱ�  4.������");
		int n=sc.nextInt();
		int ran_num1=ran.nextInt(10)+1;
		int ran_num2=ran.nextInt(10)+1;
		
		
		switch (n) {
		case 1: 
			
			System.out.println("���ϱ⸦ �����ϼ̽��ϴ�");
			System.out.println(ran_num1+"+"+ran_num2+'=');
			result=(ran_num1+ran_num2);
			break;
        case 2: 
			
			System.out.println("���⸦ �����ϼ̽��ϴ�");
			System.out.println(ran_num1+"-"+ran_num2+'=');
			result=(ran_num1-ran_num2);
			break;
		case 3:

			System.out.println("���ϱ⸦ �����ϼ̽��ϴ�");
			System.out.println(ran_num1+"*"+ran_num2+'=');
			result=(ran_num1*ran_num2);
			break;
		case 4:

			System.out.println("�����⸦ �����ϼ̽��ϴ�");
			System.out.println(ran_num1+"/"+ran_num2+'=');
			result=(ran_num1/ran_num2);
			break;
			
	
		}
		int n1=sc.nextInt();
		if(result==n1) {
		System.out.println("�����Դϴ�");
		}else {System.out.println("Ʋ�Ƚ��ϴ�");}
			

	}

}
