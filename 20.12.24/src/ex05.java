import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;




public class ex05 {

	

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("ù��° �����Է�: ");
		int n= sc.nextInt();
		
		System.out.print("�ι�° �����Է�: ");
		int n_= sc.nextInt();
		
		System.out.print("�� ���� ���ϱ�:\n"+(n+n_)); //��������������������������������������������   
		System.out.println("�� ���� ����: "+(n-n_));
		System.out.println("�� ���� ���ϱ� : "+(n*n_));
		System.out.println("�� ���� ������ : "+(n/n_));
		
		
		/*
		 * BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 * BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		 * bw.write("�Է��ϼ���>> "); bw.flush(); int n=Integer.parseInt(br.readLine());
		 * 
		 * bw.write("�Է��Ͻ� ������"+n+"�Դϴ�"); bw.flush();
		 */
		
		 
	}

}

