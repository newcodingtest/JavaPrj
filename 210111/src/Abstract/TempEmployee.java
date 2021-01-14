package Abstract;

public class TempEmployee extends AllEmployee {

   public TempEmployee(String empno, String name, int pay) {
      this.empno = empno;
      this.name = name;
      this.pay = pay;
   }


   @Override
   public int getMoneyPay() {
      return pay/12 ;
   }
   

}