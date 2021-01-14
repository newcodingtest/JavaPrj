import java.util.Scanner;

public class ex04maxclosefind {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		maxfind(n1,n2);
		closefind(n1,n2);

	}
	
	public static void maxfind(int n1,int n2) {
		if(n1>n2) {
			System.out.println(n1+"이 더 크다");
		}else if(n1<n2) {
			System.out.println(n2+"이 더 크다");
		}
	}
	
	
	public static void closefind(int n1,int n2) {
		
//		int r1=10-n1>0 ? 10-n1 : n1-10; //절대값 메소드의 구성
//		int r2=10-n2>0 ? 10-n2 : n2-10;
		
		int r1=Math.abs(10-n1); //절대값 구하는값
		int r2=Math.abs(10-n1);
	
		
		
		System.out.println("what is close to 10? ");
		
		if(r1>r2) {
			System.out.println(n2+" close");
		}
		else if(r1<r2) {
			System.out.println(n1+" close");
		}
		
		
	}

}
