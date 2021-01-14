import java.util.Random;

public class ex04findodd {

	public static void main(String[] args) { //배열로 랜덤값을 출력하여 홀짝인지 판별하기

		Random ran=new Random();
		

		int array[]=new int[10];
		
		int odd=0;
		
		for (int i = 0; i < array.length; i++) {
			array[i]=ran.nextInt(100)+1;    //랜덤값 부여
			
			if(array[i]%2==1) {      //홀수판별
				System.out.print(array[i]+"\t");
				odd++;
			}
			
		}
		System.out.println(odd+"개 입니다.");
		

	}

}
