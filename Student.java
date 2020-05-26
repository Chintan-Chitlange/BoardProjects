import java.util.Scanner;
/**
Question7.A class, namely Student, has three data members viz. Name. Roll No. and Marks of five subjects.
The stream is assigned which is based on the following criteria:                                                                                       
Average Marks Stream
90% or above         Science with Computers
80% — 89%           Science without Computers
70% — 79%           Commerce with Maths
60% — 69%           Commerce without Maths
Write a program to declare the class, ‘Student’, and define the method of allotment of subjects	
*/
public class Student
{
    double maths,phy,chem,bio,comp,percent;
    void init()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("This is a Percentage calculator");
        System.out.println("Enter the data out of 100 ");
        System.out.println("Enter your marks in Mathematics");
        maths= sc.nextDouble();
        System.out.println("Enter your marks in Physics");
        phy  = sc.nextDouble();
         System.out.println("Enter your marks in Chemistry");
        chem = sc.nextDouble();
         System.out.println("Enter your marks in Biology");
        bio  = sc.nextDouble();
         System.out.println("Enter your marks in Computers");
        comp = sc.nextDouble();
    }
    void calc()
    {
        double percent= (maths+phy+chem+bio+comp)/4;/*marks are out of 100 and 100/400=4 hence it is divided by 4.*/ 
    }
    void display()
    {
        if ((percent>=60)&&(percent<70))
        {
            System.out.println("You are eligible for \'Commerce without Maths\'.");
        }
        else if((percent>=70)&&(percent<80))
        {
            System.out.println("You are eligible for \'Commerce with Maths\'.");
        }
        else if((percent>=80)&&(percent<90))
        {
            System.out.println("You are eligible for \'Science without Computers\'.");
        }
        else if (percent>90)
        {
            System.out.println("You are eligible for \'Science with Computers\'.");
        }
        else
        {
            System.out.println("Your are not eligible for anything.");
        }
    }
    public static void main()
    {
        Student obj=new Student();
        obj.init();
        obj.calc();
        obj.display();
    }
}