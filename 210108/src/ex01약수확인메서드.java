
public class ex01약수확인메서드 {

	public static void main(String[] args) {
		// num2이 num1의 약수인지 확인하여 true 또는 false를 반환하는 isDivisor()메소드를 구현하시오
		
		int num1=10;
		int num2=3;
		boolean divisor=isDivisor(num1,num2);
		System.out.println(divisor);
		
		System.out.println(getSum(10));

	}
	

	public static boolean isDivisor(int num1, int num2){//해당 약수인지 참 거짓 판단
//	[1]	return num1%num2==0;
//	[2]	return num1%num2==0 ? true : false;
//  [3]
			if(num1%num2==0) {
			return true;
		}else {
		    return false;
		     }
	}

	public static int getSum(int num) { //해당 약수들의 합 구하기
		int sum=0;
		for(int i=1; i<=num/2; i++) { //2를 나눈이유? 자기자신을 총합에서 제외, 반복횟수 최소화
		if(num%i==0) {
			sum+=i;
		  }
	  }
		return sum;
  }
	
}

