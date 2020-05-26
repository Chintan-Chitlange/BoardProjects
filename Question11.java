import java.util.Scanner;
public class Question11
{
    String n;
    int Rn;
    double m1,m2,m3; 
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name");
        n=sc.nextLine();
        System.out.println("Please enter your roll number");
        Rn=sc.nextInt();
        System.out.println("Enter your marks in Subject 1");
        m1=sc.nextDouble();
        System.out.println("Enter your marks in Subject 2");
        m2=sc.nextDouble();
        System.out.println("Enter your marks in Subject 3");
        m3=sc.nextDouble();
    }
    void calc()
    {
        String name[]=new String[]{n};
        int rollNumber[]=new int[]{Rn};
        double marks1[]=new double[]{m1};
        double marks2[]=new double[]{m2};
        double marks3[]=new double[]{m3}; 
        double avg=(marks1[0]+marks2[0]+marks3[0])/3;
        if ((avg>=85)&&(avg<=100))
        {
            System.out.println("EXCELLENT");
        }
        else if ((avg>=75)&&(avg<=84))
        {
            System.out.println("DISTINCTION");
        }
        else if ((avg>=60)&&(avg<=74))
        {
            System.out.println("FIRST CLASS");
        }
        else if ((avg>=40)&&(avg<=59))
        {
            System.out.println("PASS");
        }
        else 
        {
            System.out.println("POOR");
        }
    }
    public static void main()
    {
        Question11 obj=new Question11();
        obj.init();
        obj.calc();
    }
}