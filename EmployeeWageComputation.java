public class EmployeeWageComputation {
    public static void main(String[] args) {
       int ispresent = 1;
       int Wageperhour  = 20;
       int Fulldayhour = 8;
       int Dailypayment = 0;
       int empCheck = (int) (Math.random() * 10) % 2 ;
       if (ispresent == empCheck){
            System.out.println("Employee is  Present");
       }
       else{
            System.out.println("Employee is Abscent");
           }
       Dailypayment=Wageperhour*Fulldayhour;
       System.out.print("\nDailypayment:"+Dailypayment);
    }
}
