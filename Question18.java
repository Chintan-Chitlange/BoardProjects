import java.util.Scanner;
public class Question18
{
    int x,rem,s,s1,s2,temp;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        s=0;
        s1=0;
        s2=0;
        temp=x;
    }
    void calc()
    {
        while(temp!=0)
        {
            rem = temp%10;
            s=s+rem;
            temp=temp/10;
        }
        for(int i=2;i<x+1;i++)
        {
            int c=i;
            while(x%i==0)
            {
                if (i<10)
                {
                    s2=s2+i;
                }
                else
                {
                    while(c!=0)
                    {
                        rem = c%10;
                        s1=s1+rem;
                        c=c/10;
                    }    
                    s2=s2+s1;
                }
                x=x/i;
            }
        }
    }
    void display()
    {
        if (s==s2)
        {
            System.out.println("It is a Smith Number");
        }
        else
        {
            System.out.println("It is not a Smith Number");
        }
    }
    public static void main()
    {
        Question18 obj=new Question18();
        obj.init();
        obj.calc();
        obj.display();
    }
}