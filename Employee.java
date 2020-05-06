import java.util.Scanner;
public class Employee
{
    float salary,sal;
    void init()
    {
        System.out.println("Please enter your base salary");
        Scanner sc=new Scanner(System.in);
        sal=sc.nextFloat();
        salary=sal;
    }
    float Salary()
    {
        float Hra=salary/2;
        salary=salary+Hra;
        return salary;
    }
    public static void main()
    {
        Employee obj=new Employee();
        obj.init();
        float result=obj.Salary();
        System.out.println("Your name is: Mukesh Ambani \n Your final salary is: "+result);
    }
}
