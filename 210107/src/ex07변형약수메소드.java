
public class ex07변형약수메소드 {

	public static void main(String[] args) {
		
		int StartValue=10;
		int endValue=36;
		getDivisors(StartValue,endValue);
	}

	public static void getDivisors(int StartValue, int endValue) {
		int result=0;
	for(int j=StartValue; j<=endValue; j++) {	
		System.out.print(j+"의 약수는?:");
		for (int i = 1; i <= j; i++) {
			if(j%i==0) {
				System.out.print(i+" ");
		}
		}
		System.out.println();
	}
	
//public static int getDivisor(int StartValue, int endValue) {
//		
//		for(int i=StartValue; i<=endValue;; i++){
//	    getDivisor(i);
	}
//			
//		}
//	
	}
}

