import java.util.Scanner;

public class ex04 { //���Ǳ�

	public static void main(String[] args) { //n::�ݾ�  n1:��ǰ����
	    int money;
	    
		int col=800;
		int water=500;
		int vita=1500;
		
		
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("=================================\n�ݾ��� �Է��ϼ���:  ");
		money=sc.nextInt();
		
		if(money<500) {
			System.out.println("=================================\n�ݾ��� �����ϴ� �ٽ��Է��ض�:  ");
			money=sc.nextInt();
		}
		
	
		System.out.println("�޴��� ������ \n "
				+ "1.�ݶ�(800��)  2.����(500��)  3.��Ÿ�ο���(1500��)\n========================" );
		
		int choice=sc.nextInt();
		int num=0;
	
		
		switch (choice) {
	
		case 1: 
			
			num=money-800;
			System.out.println("�ݶ� �����ϼ̽��ϴ�\n�ε���...");
			System.out.println("=================================\n������ �ܵ���"+(money-col)+"�� �Դϴ�");
		
			break;
			
		case 2: 
			num=money-500;
			System.out.println("������ �����ϼ̽��ϴ�\n�ε���...");
			System.out.println("=================================\n������ �ܵ���"+(money-water)+"�� �Դϴ�");
			;
			break;
			
		case 3: 
			num=money-1500;
			System.out.println("��Ÿ�ο��͸� �����ϼ̽��ϴ�\n�ε���...");
			System.out.println("=================================\n������ �ܵ���"+(money-vita)+"�� �Դϴ�");
			
			break;
			
		default:
			System.out.println("�ٽ� �Է����ּ���");
			
		}
		int Cwon=(num)/1000;
		int Owon=(num)%1000/500;
		int Bwon=(num)%1000%500/100;
		
		System.out.println("õ��"+Cwon+"\n�����"+Owon+"\n���"+Bwon);;
		}
		}
		}
		

		




