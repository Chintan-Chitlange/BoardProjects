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
      System.out.println("Enter \'A\' for alphabetical triangle");
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
        else if(ch=='A')
     {
        num = 97;
        int Final= num +n;
        for (i = num; i <=Final; i++)  
        {     
          for (j = 1; j <= n; j++)  
          { 
              System.out.print((char)num + " "); 
              num++;
          } 
          System.out.print("\n");
          num=97;
          n--;
        } 
     } 
      else
     {
         System.out.println("Invalid Inputs");
     }
   }
}