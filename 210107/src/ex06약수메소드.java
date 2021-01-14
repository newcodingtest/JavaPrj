
public class ex06약수메소드 {

	public static void main(String[] args) {
		
        
		//6의 약수 메소드
		//메소드화 함으로서 코드의 중복을 최소화 해야됨
//		for (int i = 1; i <=6; i++) {
//			System.out.println(6%i==0);
//			
//		}
		getDivisor(10);
	
	}
	//약수 메소드
	public static void getDivisor(int num) {
		
		for (int i = 1; i <=num; i++) {
		
			if(num%i==0) {
				System.out.print(i+" ");
			}
			
		}
	}

}
