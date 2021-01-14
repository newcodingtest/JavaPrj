
public class Dimension2Array {

	public static void main(String[] args) {
	
		//create 3hang 2yeol int type array 
		
//		int arr[][]=new int[3][2];
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[0][0]);
		
		int arr[][]=new int[5][5];
		
		int num=1;
		
//		arr[0][0]=num++;
//		arr[0][1]=num++;
//		arr[0][2]=num++;
//		arr[0][3]=num++;
//		arr[0][4]=num++;	
//		
//		for (int i = 0; i < arr[0].length; i++) {
//			arr[1][i]=num++;
//			
//		}
//		for (int i = 0; i < arr[0].length; i++) {
//			arr[2][i]=num++;
//			
//		}
//		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=num++;
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		
		

	}

}
	
