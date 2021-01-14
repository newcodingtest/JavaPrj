package Abstract;

public class RegularEmployee extends AllEmployee {

   
   private int bonus;// 보너스


   
   public RegularEmployee(String empno, String name, int pay, int bonus) {
      this.empno = empno;
      this.name = name;
      this.pay = pay;
      this.bonus = bonus;
      
   
   }

   // 1. 월급 계산 메소드
   @Override
   public int getMoneyPay() {
      return (pay + bonus) / 12;
   }
   
}