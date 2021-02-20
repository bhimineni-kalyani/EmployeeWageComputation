public class EmployeeWageComputation {
    public static void main(String[] args) {
       int Fulltime = 1;
       int Parttime = 2;
       int Wageperhour  = 20;
       int Salary = 0;
       int Employeehour = 0;
       int empCheck = (int) (Math.random() * 10) % 3 ;
       
       switch(empCheck){
          
            case 1:
            System.out.println("Employee is  Present");
            Employeehour = 8;
            break;
       
            case 2:
            System.out.println("Employee is Parttime");
            Employeehour = 4;
            break;
        
            default: 
            System.out.println("Employee is  Absent");
            Employeehour = 0;
        }
    Salary=Wageperhour*Employeehour;
    System.out.print("\nSalary:"+Salary);
    }
}
