
public class ex06����޼ҵ� {

	public static void main(String[] args) {
		
        
		//6�� ��� �޼ҵ�
		//�޼ҵ�ȭ �����μ� �ڵ��� �ߺ��� �ּ�ȭ �ؾߵ�
//		for (int i = 1; i <=6; i++) {
//			System.out.println(6%i==0);
//			
//		}
		getDivisor(10);
	
	}
	//��� �޼ҵ�
	public static void getDivisor(int num) {
		
		for (int i = 1; i <=num; i++) {
		
			if(num%i==0) {
				System.out.print(i+" ");
			}
			
		}
	}

}
