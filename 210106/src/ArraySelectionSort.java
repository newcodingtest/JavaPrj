import java.util.Arrays;

public class ArraySelectionSort {

   public static void main(String[] args) {
      int[] array = { 44, 57, 76, 3, 51 }; // 내림차순 정렬
      // 선택정렬
      // 가장 큰 수를 먼저 찾기.
      // 큰 수가 있는 방번호(인덱스) 기억

      for (int j = 0; j < array.length; j++) {
         int maxIndex = j;
         for (int i = j; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
               maxIndex = i;
            }
         }
         // 치환
         int temp = array[j];
         array[j] = array[maxIndex];
         array[maxIndex] = temp;
         // 기준을 변경
         
      }
      System.out.println(Arrays.toString(array));

   }

}