package problem;

public class b4 {

	public static void main(String[] args) {
		System.out.println(jumpCase(4)); //5

	}
	
public static int jumpCase(int num) { //5
	
	int n1=1;
	int n2=1;
	int answer=0;
	
	for(int i=1; i<num; i++) {
		answer=n1+n2; //ans=1+1   ans=1+2  ans=2+3
		n1=n2;         //1<<1      1<<2    2<<<3
		n2=answer;		//1<<2     2<<3    3<<<5
	}
	
	return answer;
	
	

	
}

}
