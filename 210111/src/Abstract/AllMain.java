package Abstract;



public class AllMain {

   public static void main(String[] args) {

      RegularEmployee regular = new RegularEmployee ("SMHRD001" , "����ö" , 4000, 400);
      System.out.println(regular.print());
      System.out.println(regular.getMoneyPay() + "����");
      
      TempEmployee temp = new TempEmployee("SMHRD002", "�ڼ�",3000);
      System.out.println(temp.print());
      System.out.println(temp.getMoneyPay() + "����");
      
       PartTimeEmployee partTime = new PartTimeEmployee("SMHRD003", "����ȫ", 2000, 300);
        System.out.println(partTime.print());
        System.out.println(partTime.getMoneyPay());
         
   }

}