import java.util.Scanner;
public class Question5
{
   public static void main(String args[])
     {
      int n, num = 1, c, d,i,j;
      char ch;
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the number of rows and type of triangle you want");
      System.out.println("Enter \'A\' for alphabeticl triangle");
      System.out.println("Enter\'1\' for numeric triangle");
      n=sc.nextInt();
      ch= sc.next().charAt(0);
      switch(ch)
      
     {  
        case'1' : 
        for ( c = 1 ; c <= n ; c++ )
        {
         for ( d = 1 ; d <= c ; d++ )
           {
              System.out.print(num+" ");
              num++;
           }
         System.out.println();
        }
        break;
        case 'a':
        for (i = 1; i <= n; i++)  
        {     
          num = 97; 
          for (j = 1; j <= n; j++)  
          { 
                System.out.print((char)(num -1 + j) + " "); 
          } 
          System.out.print("\n");
          n--;
        } 
        break;
     }
     }
}