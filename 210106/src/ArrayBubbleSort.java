import java.util.Arrays;

public class ArrayBubbleSort {
   public static void main(String[] args) {

      int[] array = { 45, 7, 12, 82, 25 };

      // 더 큰 값을 특정 변수에 담아서 위치를 바꿔주기
      // 치환
      // 0-1
      for (int j = 1; j < array.length; j++) {
         for (int i = 0; i < array.length - j; i++) {
            if (array[i] > array[i + 1]) {
               int temp = array[i + 1];
               array[i + 1] = array[i];
               array[i] = temp;
            }
      
         }
       
      }
      
      System.out.println(Arrays.toString(array));
   }

}