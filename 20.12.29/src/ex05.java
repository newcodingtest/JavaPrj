import java.util.Scanner;

public class ex05 { 
	//=====================�ݺ���===================================
	public static void main(String[] args) {
		
		//1. ���� Ƚ�� �ݺ�(1~100) : for
		//2. ����ڰ� �Է��� �������� �ݺ�: while

		//�ʱ⺯��
	/*	int i=0;
		int sum=0;
		while(i<=100) {
			
			sum+=i;
			i++;
			
		}
		System.out.println(sum); */
		Scanner sc=new Scanner(System.in);
		
		/*
		 * while(true) { int num=sc.nextInt(); System.out.println("����ڰ� �Է��� ��:: "+num);
		 * if(num==0) { System.out.println("����"); break; } }
		 */
		
//		while(true) {
//			System.out.println("�����Է�:  ");
//			int n=sc.nextInt();
//			if(n>=10) {
//				System.out.println("����");
//				break;
//			}
//		}
		int odd=0; //Ȧ
		int even=0; //¦
		while(true) {
		System.out.println("�����Է�:  ");
		
		for(int i=0; i<5; i++){
			int n=sc.nextInt();
			
			if(n%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Ȧ���� ������: "+odd+"\n¦���� ������: "+even);
		break;
		}
			
		
	}
	}
		

