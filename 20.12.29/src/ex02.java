import java.util.Scanner;

public class ex02 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		String num=sc.nextLine();
		
		//System.out.println("사용자가 입력한 문자: "+num);
		/*
		 * if(num.equals("윤주영")) { System.out.println("내가 바로 신이다"); }
		 */
		System.out.println("연산을 입력해라");
		String n1=sc.nextLine();
		System.out.println("a입력해라");
		int n2=sc.nextInt();
		System.out.println("b입력해라");
		int n3=sc.nextInt();
		
		int result=0;
		
		if(n1.equals("+")) {
		result=n2+n3;
		}else if(n1.equals("-")){
			result=n2-n3;
		}else if(n1.equals("*")) {ㅁ
			result=n2*n3;
		}else if(n1.equals("/")) {
			result=n2/n3;
		}
		System.out.println(n2+"와"+n3+"의 연산은"+result);
	}

}
