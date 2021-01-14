
public class ex05ArrayDataPrintMethod {

	public static void main(String[] args) {
		
		int[] arr= {1,3,4,8,7,9,10};
		
	   arrayToString(arr);
	}
	
	public static void arrayToString(int[] arr) {
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		
	}

}
