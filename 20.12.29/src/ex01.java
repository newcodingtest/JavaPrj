import java.util.Scanner;

public class ex01 {

		public static void main(String[] args) {
			
			/*int num=5;
			
			if(num>10) {
				System.out.println("10���� ũ��");
			}else if(num>7) {
				System.out.println("7���� ũ��");
			}else if(num>4) {
				System.out.println("4���� ũ��");
			}else{
				System.out.println("6���ϴ�");
			}
		}*/
			
	//����
			
			Scanner sc=new Scanner(System.in);
			int totalScore=sc.nextInt();
			
			if(totalScore>=90){
				System.out.println("a����");
				
			}else if(totalScore>=80 && 90>totalScore) {
				System.out.println("b����");
			}else if(totalScore>=70 && 80>totalScore) {
				System.out.println("c����");
			}else {
				System.out.println("d����");
				}
			}
			
			
		}

