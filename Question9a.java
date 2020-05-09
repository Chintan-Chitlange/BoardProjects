public class Question9a
{
    public static void main()
    {
        int s,i ;
        s=0;
        for (i=2;i<=20;i+=2)
        {
            if (i%4==0)
            {
                s=s-i;
            }
            else
            {
                s=s+i;
            }
        }
        System.out.println(s);
    }
}