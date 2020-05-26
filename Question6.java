import java.util.Scanner;
public class Question6
{
    String str;
    void longestWord()
    {
        Scanner sc=new Scanner(System.in);
        str = sc.nextLine();
        String[] word = str.split("\\s");
        int count=0,x=0,z,i;
        String c;
         for( i=0;i<word.length;i++)
        {
            x=Math.max(x,word[i].length());
        } 
        for(i=0;i<word.length;i++)
        {
           if(x==word[i].length())
            {
                c=word[i];
                System.out.println("The longest word is "+c);
            }
        } 
    }
    public static void main()
    {
        Question6 obj=new Question6();
        obj.longestWord();
    }
}