package OOP;

import java.util.Scanner;

public class TeacherPocketmonMain {

   public static void main(String[] args) {

      // ���α�
	   TeacherPocketmon kkobuk = new TeacherPocketmon("��", "���α�", 100, 15, 7, "������");
      // ���ڸ�
	   TeacherPocketmon lijamong = new TeacherPocketmon("��", "���ڸ�", 500, 50, 6, "�Ҵ���");

      Scanner sc = new Scanner(System.in);

      int round = 0;
      // �� ���� ü���� 0�� �ɶ����� ��Ʋ�� ��������!
      while (true) {
         // 0. ���ϸ� �Է�
         System.out.print("����Ͻ� ���ϸ��� �Է��ϼ��� >> ");
         String pocketName = sc.next();
         System.out.print("1.���� 2.�ʻ�� >> ");
         int choice = sc.nextInt();
         // 1. ���� 2.�ʻ�� --->�Է�
         switch (choice) {
         case 1:
            round++;
            if (pocketName.equals(kkobuk.getName())) {
               // ���αⰡ ���� --> ���ڸ��� ü�� ����
               lijamong.setHP(lijamong.getHp() - kkobuk.getAttack());
            } else if (pocketName.equals(lijamong.getName())) {
               // ���ڸ��� ���� --> ���α��� ü�� ����
               kkobuk.setHP(kkobuk.getHp() - lijamong.getAttack());
            } else {
               System.out.println("�ش� ���ϸ��� ���� ���ϸ��Դϴ�.");
            }
            break;
         case 2:
            round++;
            if (pocketName.equals(kkobuk.getName())) {
               // ���αⰡ �ʻ��(���ݷ� *2) --> ���ڸ��� ü�� ����
               lijamong.setHP(lijamong.getHp() - kkobuk.getAttack() * 2);
            } else if (pocketName.equals(lijamong.getName())) {
               // ���ڸ��� �ʻ��(���ݷ� *2) --> ���α��� ü�� ����
               kkobuk.setHP(kkobuk.getHp() - lijamong.getAttack() * 2);
            } else {
               System.out.println("�ش� ���ϸ��� ���� ���ϸ��Դϴ�.");
            }

            break;
         default:
            System.out.println("�߸� �Է��ϼ̽��ϴ�.");
            // ����(���ݷ� ��ŭ ��� ���ϸ��� ü���� ����)
            // �ʻ��(���ݷ� * 2�踸ŭ ��� ���ϸ��� ü���� ����)

         }

         if (kkobuk.getHp() <= 0) {
            System.out.println(kkobuk.getName() + "�� �й�...����...");
            System.out.println(lijamong.getName() + "�� �¸�...!!");
            break;
         } else if (lijamong.getHp() <= 0) {
            System.out.println(lijamong.getName() + "�� �й�...����...");
            System.out.println(kkobuk.getName() + "�� �¸�...!!");
            break;
         }

      }
      System.out.println("�� " + round + "���� ����!");

      // ����� ���� �Ŀ� ��Ʋ�� ������ �� ���
      // ���� ��������.. ��������.. ���

   }

}