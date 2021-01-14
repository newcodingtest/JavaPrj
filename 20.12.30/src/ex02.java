import java.util.Random;

public class ex02 {

	public static void main(String[] args) {
		
		//·£´ı¼ö
		Random ran=new Random();
		
		while(true) {
		int ran_num1=ran.nextInt(10)+1;
		int ran_num2=ran.nextInt(10)+1;
		int ran_num3=ran.nextInt(10)+1;
		
		if(ran_num1 !=ran_num2 &&ran_num2 !=ran_num3 &&ran_num1 !=ran_num3 ) {
		
		System.out.println(ran_num1);
		System.out.println(ran_num2);
		System.out.println(ran_num3);
		break;
		}
	
		}

}
}