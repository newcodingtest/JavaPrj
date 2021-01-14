
public class ManyDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[][]=new int[5][5];
    
    // int num=21;   //[2]번에는 무쓸모
     
     //[1]
//     for (int j = 0; j < arr.length; j++) {
//       for (int i = 0; i < arr.length; i++) {
//		arr[i][j]=num++;
//	}
//     } 
//     
//     
//     for (int i = 0; i < arr.length; i++) {
//	
//         for (int j = 0; j < arr.length; j++) {
//    		System.out.print(arr[i][j]+"\t");
//    	}
//         System.out.println();
//          } 
//     System.out.println();
     
//   [2]
     
     for (int j = 0; j < arr[0].length; j++) {
         int num = 21 + j;
         for (int i = 0; i < arr.length; i++) {
            arr[j][i] = num;
            num += 5;
            System.out.print(arr[j][i] +"\t");
         }
         System.out.println();
      }

     
     
	}
	
}


