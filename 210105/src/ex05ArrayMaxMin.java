import java.util.Random;



public class ex05ArrayMaxMin {// 1���� ������ �迭�� ������ �� 5ũ�� ������ �ʱ�ȭ �մϴ�.   
	               // �迭�� �� �� ���� ū���� ã�� ����ϴ� ���α׷��� �ۼ��ϼ���
	public static void main(String[] args) {
	Random rnum=new Random();
	int arr[]=new int[5];
	int max=arr[0];
	int min=11;
	
	for(int i=0; i<arr.length; i++) {
		arr[i]=rnum.nextInt(10)+1;
		System.out.println(arr[i]);
		
		if(arr[i]>max) {
			max=arr[i];	
		}
		else if(arr[i]<min){
			min=arr[i];	
			
		}
	}
	System.out.println("���� ū���� "+max+"�Դϴ�");
	System.out.println("���� �������� "+min+"�Դϴ�");
}
}
