
public class ex01array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int n1;
		int n2;
		int n3;
		int n4;
		int n5;
		int n6;
		int n7;
		int n8;
		int n9;
		int n10;
		
		
		//������ �迭 arr ->ũ��� 5ĭ
		int arr[]=new int[5];
		System.out.println(arr);
         
		//�迭�� 0���� ����
		System.out.println(arr[0]);  
		
		//�迭�� ù��°�� �� ����
		arr[0]=4;
		
		//���� �����԰� ���ÿ� �迭�� �����ϴ� ���
		String arr2[]= {"���ֿ�", "����", "����������","�ϰ�ʹ�"};
		
		//arr2�� ���̴�? -> 3
		System.out.println(arr2[2]+" "+arr2[3]);
		
		//�迭������ ����
		int intArray[]=new int[5];
		int myArray[]=intArray;
		
		intArray[1]=2;
		System.out.println(intArray[1]);
		
		myArray[1]=6;
		System.out.println(intArray[1]);
				
		

	}

}
