public class EmployeeWageComputation {
    public static void main(String[] args) {
       int isPresent =1;
       int Fulltime = 1;
       int Parttime = 2;
       int Maxhoursinmonth = 100;
       int Wageperhour  = 20;
       int totalsalary = 0;
       int Totalemployeehours = 1;
       int Employeehours = 10;
       int Numberworkingdays = 20;
       int totalworkingdays =  20;
       while ( Totalemployeehours < Maxhoursinmonth &&
              totalworkingdays < Numberworkingdays){
           totalworkingdays++ ;
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
       Totalemployeehours=Totalemployeehours*Employeehours;
       System.out.println("\nTotalEmployeehours:"+ Wageperhour);
       }
    }
}    
