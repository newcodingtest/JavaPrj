package OOP;

import java.util.Scanner;

public class TeacherPocketmonMain {

   public static void main(String[] args) {

      // 꼬부기
	   TeacherPocketmon kkobuk = new TeacherPocketmon("물", "꼬부기", 100, 15, 7, "물대포");
      // 리자몽
	   TeacherPocketmon lijamong = new TeacherPocketmon("불", "리자몽", 500, 50, 6, "불대포");

      Scanner sc = new Scanner(System.in);

      int round = 0;
      // 한 쪽의 체력이 0이 될때까지 배틀을 진행하자!
      while (true) {
         // 0. 포켓몬 입력
         System.out.print("사용하실 포켓몬을 입력하세요 >> ");
         String pocketName = sc.next();
         System.out.print("1.공격 2.필살기 >> ");
         int choice = sc.nextInt();
         // 1. 공격 2.필살기 --->입력
         switch (choice) {
         case 1:
            round++;
            if (pocketName.equals(kkobuk.getName())) {
               // 꼬부기가 공격 --> 리자몽의 체력 감소
               lijamong.setHP(lijamong.getHp() - kkobuk.getAttack());
            } else if (pocketName.equals(lijamong.getName())) {
               // 리자몽이 공격 --> 꼬부기의 체력 감소
               kkobuk.setHP(kkobuk.getHp() - lijamong.getAttack());
            } else {
               System.out.println("해당 포켓몬은 없는 포켓몬입니다.");
            }
            break;
         case 2:
            round++;
            if (pocketName.equals(kkobuk.getName())) {
               // 꼬부기가 필살기(공격력 *2) --> 리자몽의 체력 감소
               lijamong.setHP(lijamong.getHp() - kkobuk.getAttack() * 2);
            } else if (pocketName.equals(lijamong.getName())) {
               // 리자몽이 필살기(공격력 *2) --> 꼬부기의 체력 감소
               kkobuk.setHP(kkobuk.getHp() - lijamong.getAttack() * 2);
            } else {
               System.out.println("해당 포켓몬은 없는 포켓몬입니다.");
            }

            break;
         default:
            System.out.println("잘못 입력하셨습니다.");
            // 공격(공격력 만큼 상대 포켓몬의 체력이 감소)
            // 필살기(공격력 * 2배만큼 상대 포켓몬의 체력이 감소)

         }

         if (kkobuk.getHp() <= 0) {
            System.out.println(kkobuk.getName() + "의 패배...흑흑...");
            System.out.println(lijamong.getName() + "의 승리...!!");
            break;
         } else if (lijamong.getHp() <= 0) {
            System.out.println(lijamong.getName() + "의 패배...흑흑...");
            System.out.println(kkobuk.getName() + "의 승리...!!");
            break;
         }

      }
      System.out.println("총 " + round + "라운드 진행!");

      // 몇번의 공격 후에 배틀이 끝나는 지 출력
      // 누가 승자인지.. 패자인지.. 출력

   }

}