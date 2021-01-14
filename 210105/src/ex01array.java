
public class ex01array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int n1;
		int n2;
		int n3;
		int n4;
		int n5;
		int n6;
		int n7;
		int n8;
		int n9;
		int n10;
		
		
		//정수형 배열 arr ->크기는 5칸
		int arr[]=new int[5];
		System.out.println(arr);
         
		//배열은 0부터 시작
		System.out.println(arr[0]);  
		
		//배열의 첫번째에 값 선언
		arr[0]=4;
		
		//값을 지정함과 동시에 배열을 생성하는 방법
		String arr2[]= {"윤주영", "워쉽", "월드오브워쉽","하고싶다"};
		
		//arr2의 길이는? -> 3
		System.out.println(arr2[2]+" "+arr2[3]);
		
		//배열끼리의 복사
		int intArray[]=new int[5];
		int myArray[]=intArray;
		
		intArray[1]=2;
		System.out.println(intArray[1]);
		
		myArray[1]=6;
		System.out.println(intArray[1]);
				
		

	}

}
