
public class Question8
{
    void check(String str,char ch)
    {
        int count =0 ,limit;
        str=str.toLowerCase();
        int len = str.length();
        int x,y;
        for(int i=0;i<len;i++)
        {
            x = str.charAt(i);
            y = (int)ch;
            if(x==y)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    void check(String s1)
    {
        int count=0,limit;
        s1=s1.toLowerCase();
        int len =s1.length();
        char x,y;
        for (int i=0;i<len;i++)
        {
            x= s1.charAt(i);
            if (x=='a')
            {
                System.out.print("a \t");
            }
            else if (x=='e')
            {
                System.out.print("e \t");
            }
            else if (x=='i')
            {
                System.out.print("i \t");
            }
            else if (x=='o')
            {
                System.out.print("o \t");
            }
            else if (x=='u')
            {
                System.out.print("u \t");
            }
            else
            {
                
            }
        }
    }
    public static void main(String w,char a,String s)
    {
        Question8 obj=new Question8();
        obj.check(w,a);
        obj.check(s);
    }
}
