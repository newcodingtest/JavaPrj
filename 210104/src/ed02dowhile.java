import java.util.Random;
import java.util.Scanner;

public class ed02dowhile {

	public static void main(String[] args) {
		
//do-while�� ����
		Scanner sc=new Scanner(System.in);
		System.out.println("====1���� 100���� ���� ���߱� ����====");
		Random rnum=new Random();
		int n1=rnum.nextInt(100)+1;
		
		
		do {
			System.out.print("1�� 100������ ������ �Է��ϼ��� >>");
			int n=sc.nextInt();
			if(n==n1) {
				System.out.println("�����Դϴ�.");
				break;
			}else if(n>n1) {
				System.out.println("�� �������� �ٽ��ϼ���");
			}else if(n<n1) {
				System.out.println("�� �������� �ٽ��ϼ���");
			}
			
		}while(true);
	}

}
