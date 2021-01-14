import java.util.Arrays;
import java.util.Random;

public class ex07lotto {   //로또번호 생성하기  //정수배열 5칸생성,  랜덤값 1~10으로 초기화 ,     중복된 값 제거(부여한 값이 같다면)

	public static void main(String[] args) {
	     Random rnum=new Random();
	   //정수형 배열 array 5칸 생성
		 int arr[]=new int[5];  
		 
		//랜덤값 1~10으로 초기화
		 for (int i = 0; i < arr.length; i++) {
			 arr[i]=rnum.nextInt(10)+1;
			 
			//중복된 값 제거
			 for (int j = 0; j < i; j++) {
				 if(arr[i]==arr[j]) {
			        //인덱스를 -1 해서 랜덤한 값을 부여하는 방법
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

	
