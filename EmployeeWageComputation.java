public class EmployeeWageComputation {
    public static void main(String[] args) {
       int isPresent =1;
       int Fulltime = 1;
       int Parttime = 2;
       int Wageperhour  = 20;
       int totalsalary = 0;
       int Employeehours = 10;
       int Numberworkingdays = 20;
       for (int day=1; day<=Numberworkingdays; day++){
           int empCheck = (int) (Math.random() * 10) % 3 ;
               switch (empCheck) {  

                     case 01: 
                     System.out.println("\nEmployee is  Present");
                     Employeehours = 8;
                     break;
       
                     case 02:
                     System.out.println("\nEmployee is Parttime");
                     Employeehours = 4;
                     break;
        
                     default:
                     System.out.println("\nEmployee is  Absent");
                     Employeehours = 0;
              }
       totalsalary=Employeehours*Wageperhour;
       System.out.println("\ntotalsalary:"+totalsalary);
       }
    }
     
}    
