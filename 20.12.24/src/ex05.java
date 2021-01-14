import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;




public class ex05 {

	

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("첫번째 정수입력: ");
		int n= sc.nextInt();
		
		System.out.print("두번째 정수입력: ");
		int n_= sc.nextInt();
		
		System.out.print("두 수의 더하기:\n"+(n+n_)); //ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ   
		System.out.println("두 수의 빼기: "+(n-n_));
		System.out.println("두 수의 곱하기 : "+(n*n_));
		System.out.println("두 수의 나누기 : "+(n/n_));
		
		
		/*
		 * BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 * BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		 * bw.write("입력하세요>> "); bw.flush(); int n=Integer.parseInt(br.readLine());
		 * 
		 * bw.write("입력하신 정수는"+n+"입니다"); bw.flush();
		 */
		
		 
	}

}

