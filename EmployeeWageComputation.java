public class EmployeeWageComputation {
    public static void main(String[] args) {
       int ispresent = 1;
       int Wageperhour  = 20;
       int Fulldayhour = 8;
       int Parttimehour = 8;
       int Salary = 0;
       int Employeehour = 0;
       int empCheck = (int) (Math.random() * 10) % 3 ;
       if (Fulldayhour == empCheck){
            System.out.println("Employee is  Present");
            Employeehour = 8;
       }
       else if(Parttimehour == empCheck){
            System.out.println("Employee is Parttime");
            Employeehour = 4;
        }
        else
        {
                   Employeehour = 0;
        }
    Salary=Wageperhour*Employeehour;
    System.out.print("\nSalary:"+Salary);
    }
}
