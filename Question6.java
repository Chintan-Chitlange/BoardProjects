import java.io.*;
/**
* WAP to check whether a number is a valid ISBN number or not.
The International Standard Book Number (ISBN)’ which is a unique number. By this number, we can find any book.
It is a 10 digit number. The ISBN is legal if 1*digit1 + 2*digit2 + 3*digit3 + 4*digit4 + 5*digit5 + 6*digit6 + 7*digit7 + 8*digit8 
+ 9*digit9 + 10*digit10 is divisible by 11.
Example: For an ISBN "1259060977"
Sum = 1*10 + 2*9 + 5*8 + 9*7 + 0*6 + 6*5 + 0*4 + 9*3 + 7*2 + 7*1 = 209
Now divide it with 11 = 20%/11 = 0. If the resultant value will be Zero then it is a valide ISBN.
*/
class Question6
{
    public static void main(String[] args) throws IOException
    {
        long isbnNumber;
        int s = 0, i, t, d, dNumber;
        String st;
        // Input a 10-digit ISBN number
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.print("Input a 10-digit ISBN number: ");
        isbnNumber = Long.parseLong(br.readLine());

        // check the length is 10, otherwise, exit from the program
        st = "" + isbnNumber;
        if (st.length() != 10)
        {
            System.out.println("Illegal ISBN");
            return;
        }
        s = 0;
        for (i = 0; i < st.length(); i++)
        {
            d = Integer.parseInt(st.substring(i, i + 1));
            dNumber = i + 1;
            t = dNumber * d;
            s += t;
        }

        // check the number s is divisible by 11 or not
        if ((s % 11) != 0)
        {
            System.out.println("Illegal ISBN");
        } 
        else
        {
            System.out.println("Legal ISBN");
        }
    }
}
