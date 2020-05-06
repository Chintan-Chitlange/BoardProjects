import java.util.Scanner;
/*Q2.Write a program with an “Employee” class having two variables one for
 * the name of employee(String) and other for base salary (float).Create a function that calculates the
 * total salary by adding 50% HRA to the salary and returns.Create an object of this class in
 * main function and set the name of the employee, call the 
 * salary function and print the calculated salary returned by the function with name of the employee.*/
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