import java.io.*;
class Question4
{
       public static void main ( ) throws IOException
       {
          InputStreamReader IR = new InputStreamReader (System.in);
          BufferedReader br = new BufferedReader (IR);
          System.out.println ("User Menu");
          System.out.println ("1. Term Deposite");
          System.out.println ("2. Recurring deposits");
          System.out.println ("Enter the choice (1 or 2) :");
          int ch = Integer.parseInt (br.readLine ( ));
          switch (ch)
          {
             case 1:
             System.out.println("Enter principal :");
             float P = Float.parseFloat (br.readLine ( ));
             System.out.println ("Enter rate of interest :");
             float r =  Float.parseFloat (br.readLine ( ));
             System.out.println ("Enter time period in years :");
             float n = Float.parseFloat (br.readLine ( ));
             double a = 1 + (r/100);
             double A = P * Math.pow (a,n);
             System.out.println ("Maturity Amount : "+ "A");
              break;
             
              case 2 :
              System.out.println ("Enter Monthly installment");
              P = Float.parseFloat (br.readLine ());
              System.out.println ("Enter Rate of Interest :");
              r = Float.parseFloat (br.readLine ( ));
              System.out.println ("Enter time period in months :");
             n = Float.parseFloat(br.readLine ( )); 
              a = (r/100)*(1/12);
              double b = (n*(n+1)/2)*a;
              A = (P * n)+ (P * b);
            System.out.println ("Maturity Amount :" + "A");
            break;
            default : System.out.println ("Wrong choice");
        }
    } 
} 