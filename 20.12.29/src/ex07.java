import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
		int result=0;
		
		Scanner sc=new Scanner(System.in);

		System.out.print("���������:  ");
		int n=sc.nextInt();
		System.out.print("��ǥ������:  ");
		int n_=sc.nextInt();
		
		/*
		 * System.out.print("1���� ���� ������:  "); int n1=sc.nextInt();
		 * System.out.print("2���� ����������:  "); int n2=sc.nextInt();
		 * System.out.print("3���� ����������:  "); int n3=sc.nextInt();
		 * System.out.print("4���� ����������:  "); int n4=sc.nextInt();
		 */
		
		while(true) {
			for(int i=1; i<6; i++) {
			System.out.print(i+"���� ���� ������:  ");
			
			int min=sc.nextInt();
			result+=min;
			
		}
		if((n-result)<=70) {
		System.out.println(n-result+"�޼�!! ����");
		break;
		}else {
			System.out.println("�׸� �԰� ���� ����");
			break;
		}
	}

	}
}