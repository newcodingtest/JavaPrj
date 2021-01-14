
public class ex02완전수메소드 {

	public static void main(String[] args) {//완전수:자기 자신을 제외한 양의 약수를 더했을 때 자기 자신이 되는 양의 정수

		System.out.println(isPerfect(6));
		
		int startValue=2;
		int endValue=1000;
	
		getPerfectNumber(startValue,endValue);
		
	}
	
	
	
	public static int getSum(int num) { //완전수들의 합을 구한다
		int sum=0;
		for(int i=1; i<=num/2; i++) { 
		if(num%i==0) {
			sum+=i;
		  }
	  }
		return sum;
  }
	
public static boolean isPerfect(int num) { //완전수인지 아닌지 true false 로 판별
		
		return  num==getSum(num);
	}
	
//	public static void getPerfectNumber(int startValue, int endValue) {
//		System.out.print(startValue+"~"+endValue+"까지의 완전수: ");
//		for(int i=startValue; i<=endValue/2; i++) {
//			int sum=0;
//			if(endValue%startValue==0) {
//				sum+=i;
//			}
//			if(sum==getSum(i)) {
//				
//				System.out.print(i+" ");
//			                   }
//			                              }
//		                                        }
	
	public static void getPerfectNumber(int startValue, int endValue) {
		System.out.print(startValue+"~"+endValue+"까지의 완전수: ");
		for(int i=startValue; i<=endValue/2; i++) {
			
			if(isPerfect(i)) {
				System.out.print(i+" ");
			}
			                              }


}
}
