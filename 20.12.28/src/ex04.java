import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    /*
     System.out.print("ù ��° ���� �Է�: ");
     int n1=sc.nextInt();
     System.out.print("ù ��° ���� �Է�: ");
     int n2=sc.nextInt();
     
   
     System.out.print("�μ��� ��: " +((n1>n2) ? (n1-n2):(n2-n1)));
    */
     
    /* System.out.print("�󱸰��� ������ �Է��ϼ���: ");
     int n1=sc.nextInt();
     System.out.print("�ʿ��� ������ ��: "+(((n1%5)==0) ?(n1/5):((n1/5)+1)));
     */
    
    int normal=5000;
    System.out.print("�뵿�ð��� �Է��ϼ���: ");
    int n=sc.nextInt(); 
    System.out.println("�� �ӱ��� "+((n>8) ?8*normal+(n-8)*normal*1.5 :n*normal));
    
	}

}
