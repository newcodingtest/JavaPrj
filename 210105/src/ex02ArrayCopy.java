
public class ex02ArrayCopy {

	public static void main(String[] args) {
	
		 int arr[]=new int[5];
		 int myarr[]= arr;
          
		 
		 System.out.println(arr);
		 System.out.println(myarr);
		 
		 arr[0]=4;
		 System.out.println(arr[0]);
		 
		 myarr[0]=1;
		 System.out.println(myarr[0]);
	}

}
