import java.util.Scanner;
import java.util.*;
public class Question12
{
    void Start()
    {
        Scanner sc= new Scanner(System.in);
        String arr[]=new String[5];
        System.out.println("Enter 20 names");
        for (int i=0;i<5;i++)
        {
            arr[i]=sc.nextLine();
        }
        int len=arr.length;
        String temp;
        for (int i=0;i<len-1;i++)
        {
            for (int j=0;j<(len-i-1);j++)
            {
                if (arr[j].compareTo(arr[j+1])>0)
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The sorted names are :");
        for (int i=0; i<len;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main()
    {
        Question12 obj=new Question12();
        obj.Start();
    }
}