import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("DB ����: ");
		int num1=sc.nextInt();
		System.out.print("���ڰ��� ����: ");
		int num2=sc.nextInt();
		System.out.print("��������� ����: ");
		int num3=sc.nextInt();//�ٱ���
		System.out.print("����Ʈ������� ����: ");
		int num4=sc.nextInt();
		System.out.print("OS ����: ");
		int num5=sc.nextInt();
		
		int sum=num1+num2+num3+num4+num5;
		
		if(sum>=60 && num1>=12 && num2>=12 && num3>=12 && num4>=12 && num5>=12) {
		System.out.println("�հ��Դϴ�");
//		if(age%3==0 &&  age%5==0) {
//		System.out.println("�� 5�� 3�� �����!!");
//		}else {
//			System.out.println("�ƴ�����!!");
//		}
	}else {
		System.out.println("���հ��Դϴ�");
		}
	}
		
		

}
