import java.util.Scanner;
public class Question5
{
   public static void main(String args[])
   {
      int n, num = 1, c, d,i,j;
      char ch;
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the number of rows and type of triangle you want");
      n=sc.nextInt();
      System.out.println("Enter \'5\' for triangle of 5 to n terms");
      System.out.println("Enter\'1\' for numeric triangle");
      ch= sc.next().charAt(0);  
        if (ch=='1')
     {
        for ( c = 1 ; c <= n ;++c)
        {
         for ( d = 1 ; d <= c ;++d )
          {
              System.out.print(num+" ");
              num++;
          }
         num=1;
         System.out.println();
        }
     }
        else if(ch=='5')
     {
           int temp=n;
        for(int i=1;i<=n;i++)
        {
           for (int j=temp;j>0;j--)
           {
              System.out.print("5");
           }
           temp--;
        }
     } 
      else
     {
         System.out.println("Invalid Inputs");
     }
   }
}
