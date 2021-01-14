package problem;

public class change3{
	  //a = 97 z = 122   A = 65 Z = 90
	public static void main(String[] args) {

	System.out.println(change124(9));
	}
	
	public static String change124(int num) {
	
	String OneTwoFour="";
	
	while(num>0) {
		if(num%3==0) {
			OneTwoFour="4"+OneTwoFour;
			num=num/3-1;
		}else {
			OneTwoFour=Integer.toString(num%3)+OneTwoFour;
			num=num/3;
		}
	}
	
	
	
	return OneTwoFour;
	
	}
}