package Abstract;

public  class PartTimeEmployee extends AllEmployee {

   private int workDay; //일수
   
   
   public PartTimeEmployee(String empno, String name, int pay, int workDay) {
      this.empno = empno;
      this.name = name;
      this.pay = pay;
      this.workDay = workDay;
   }
   
   // 1. 월급계산
   @Override
   public int getMoneyPay() {
      return pay * workDay;
   }
   
}