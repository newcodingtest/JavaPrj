import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;




public class ex05 {

	

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("湛腰属 舛呪脊径: ");
		int n= sc.nextInt();
		
		System.out.print("砧腰属 舛呪脊径: ");
		int n_= sc.nextInt();
		
		System.out.print("砧 呪税 希馬奄:\n"+(n+n_)); //せせせせせせせせせせせせせせせせせせせせせせ   
		System.out.println("砧 呪税 皐奄: "+(n-n_));
		System.out.println("砧 呪税 咽馬奄 : "+(n*n_));
		System.out.println("砧 呪税 蟹刊奄 : "+(n/n_));
		
		
		/*
		 * BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 * BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		 * bw.write("脊径馬室推>> "); bw.flush(); int n=Integer.parseInt(br.readLine());
		 * 
		 * bw.write("脊径馬重 舛呪澗"+n+"脊艦陥"); bw.flush();
		 */
		
		 
	}

}

