
public class ex03 {

	public static void main(String[] args) {
		
		
		int num=3;
		
		switch (num) {
		case 3:
			System.out.println("num은 3이다");
			
		case 1: 
			System.out.println("num은 1이다");
			break;
		
		default:
			System.out.println("응 둘다아니야");
			break;
		}
		/*
		  다중if문과 switch문의 차이점
		  다중if문: 범위를 지정(70~80, 81~90, 91~100)
		 switch문: 변수가 어떠한 단일값과
		  일치하는지 확인(n==1, cal=="+")
		 */
	}

}
