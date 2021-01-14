import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    /*
     System.out.print("첫 번째 정수 입력: ");
     int n1=sc.nextInt();
     System.out.print("첫 번째 정수 입력: ");
     int n2=sc.nextInt();
     
   
     System.out.print("두수의 차: " +((n1>n2) ? (n1-n2):(n2-n1)));
    */
     
    /* System.out.print("농구공의 개수를 입력하세요: ");
     int n1=sc.nextInt();
     System.out.print("필요한 상자의 수: "+(((n1%5)==0) ?(n1/5):((n1/5)+1)));
     */
    
    int normal=5000;
    System.out.print("노동시간을 입력하세요: ");
    int n=sc.nextInt(); 
    System.out.println("총 임금은 "+((n>8) ?8*normal+(n-8)*normal*1.5 :n*normal));
    
	}

}
