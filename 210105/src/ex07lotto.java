import java.util.Arrays;
import java.util.Random;

public class ex07lotto {   //�ζǹ�ȣ �����ϱ�  //�����迭 5ĭ����,  ������ 1~10���� �ʱ�ȭ ,     �ߺ��� �� ����(�ο��� ���� ���ٸ�)

	public static void main(String[] args) {
	     Random rnum=new Random();
	   //������ �迭 array 5ĭ ����
		 int arr[]=new int[5];  
		 
		//������ 1~10���� �ʱ�ȭ
		 for (int i = 0; i < arr.length; i++) {
			 arr[i]=rnum.nextInt(10)+1;
			 
			//�ߺ��� �� ����
			 for (int j = 0; j < i; j++) {
				 if(arr[i]==arr[j]) {
			        //�ε����� -1 �ؼ� ������ ���� �ο��ϴ� ���
					i--;
					break;
				 }
			}
		 }
		 
		 System.out.println(Arrays.toString(arr));
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//			
//		}
		

	}
	}

	
