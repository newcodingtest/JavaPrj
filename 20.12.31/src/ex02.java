import java.util.Random;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		// while: �߱�����(���ǹ�/����/��������)
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("ù��° ���� �Է� >> ");
		int n1=sc.nextInt();
		
		System.out.print("�ι�° ���� �Է� >> ");
		int n2=sc.nextInt();
		
		System.out.print("����° ���� �Է� >> ");
		int n3=sc.nextInt();
		
		if((n1>n3 && n1<n2) || (n1>n2) &&(n1<n3)) {
			System.out.println(n1);
		}else if((n2>n3 && n2<n1)||(n2>n1 && n2<n3)){
			System.out.println(n2);
		}else if(n1==n2 || n1==n3) {
			System.out.println(n1);
			
		}else if(n1==n2 || n2==n3) {
			System.out.println(n2);
		}
		else if(n2==n3 ||n1==n3) {
			System.out.println(n3);
		}
		
		else if(n1==n2 &&n2==n3 && n3==n1){
			System.out.println(n1);
		}
		
		

	}

}
