import java.util.Random;



public class ex05ArrayMaxMin {// 1차원 정수형 배열을 선언한 후 5크기 값으로 초기화 합니다.   
	               // 배열의 값 중 가장 큰값을 찾아 출력하는 프로그램을 작성하세요
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
	System.out.println("가장 큰값은 "+max+"입니다");
	System.out.println("가장 작은값은 "+min+"입니다");
}
}
