import java.util.Scanner;

public class ex02 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		String num=sc.nextLine();
		
		//System.out.println("����ڰ� �Է��� ����: "+num);
		/*
		 * if(num.equals("���ֿ�")) { System.out.println("���� �ٷ� ���̴�"); }
		 */
		System.out.println("������ �Է��ض�");
		String n1=sc.nextLine();
		System.out.println("a�Է��ض�");
		int n2=sc.nextInt();
		System.out.println("b�Է��ض�");
		int n3=sc.nextInt();
		
		int result=0;
		
		if(n1.equals("+")) {
		result=n2+n3;
		}else if(n1.equals("-")){
			result=n2-n3;
		}else if(n1.equals("*")) {��
			result=n2*n3;
		}else if(n1.equals("/")) {
			result=n2/n3;
		}
		System.out.println(n2+"��"+n3+"�� ������"+result);
	}

}
