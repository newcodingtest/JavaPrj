import java.util.Random;

public class ex04findodd {

	public static void main(String[] args) { //�迭�� �������� ����Ͽ� Ȧ¦���� �Ǻ��ϱ�

		Random ran=new Random();
		

		int array[]=new int[10];
		
		int odd=0;
		
		for (int i = 0; i < array.length; i++) {
			array[i]=ran.nextInt(100)+1;    //������ �ο�
			
			if(array[i]%2==1) {      //Ȧ���Ǻ�
				System.out.print(array[i]+"\t");
				odd++;
			}
			
		}
		System.out.println(odd+"�� �Դϴ�.");
		

	}

}
