import java.util.Arrays;

public class ArraySelectionSort {

   public static void main(String[] args) {
      int[] array = { 44, 57, 76, 3, 51 }; // �������� ����
      // ��������
      // ���� ū ���� ���� ã��.
      // ū ���� �ִ� ���ȣ(�ε���) ���

      for (int j = 0; j < array.length; j++) {
         int maxIndex = j;
         for (int i = j; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
               maxIndex = i;
            }
         }
         // ġȯ
         int temp = array[j];
         array[j] = array[maxIndex];
         array[maxIndex] = temp;
         // ������ ����
         
      }
      System.out.println(Arrays.toString(array));

   }

}