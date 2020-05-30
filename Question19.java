import java.util.Scanner;
public class Question19
{
    String str,str2="";
    void newWord()
    {
        Scanner sc=new Scanner(System.in);
        str = sc.nextLine();
        str=str.toLowerCase();
        int len=str.length();
        char c;
        for(int i=0;i<len;i++)
        {
            c=str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                int c1 = c;
                c1=c1+1;
                c=(char)c1;
                str2 =str2+c;
            }
            else
            {
                str2=str2+c;
            }
        }
        System.out.println(str2);
    }
    public static void main()
    {
        Question19 obj=new Question19();
        obj.newWord();
    }
}