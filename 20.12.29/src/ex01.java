import java.util.Scanner;

public class ex01 {

		public static void main(String[] args) {
			
			/*int num=5;
			
			if(num>10) {
				System.out.println("10보다 크다");
			}else if(num>7) {
				System.out.println("7보다 크다");
			}else if(num>4) {
				System.out.println("4보다 크다");
			}else{
				System.out.println("6이하다");
			}
		}*/
			
	//문제
			
			Scanner sc=new Scanner(System.in);
			int totalScore=sc.nextInt();
			
			if(totalScore>=90){
				System.out.println("a학점");
				
			}else if(totalScore>=80 && 90>totalScore) {
				System.out.println("b학점");
			}else if(totalScore>=70 && 80>totalScore) {
				System.out.println("c학점");
			}else {
				System.out.println("d학점");
				}
			}
			
			
		}

