import java.util.Scanner;
public class Question12
{
    void Start()
    {
        Scanner sc= new Scanner(System.in);
        char arr[]=new char[20];
        System.out.println("Enter 20 characters");
        int num=arr.length;
        int temp=0;
        for (int i=0;i<20;i++)
        {
            arr[i]=sc.next().charAt(0);
        } 
        for (int i=0;i<20;i++)
        {
            arr[i]= Character.toLowerCase(arr[i]);
        } 
        for (int i = 0; i < ( num - 1 ); i++)
        {
            for (int j = 1; j < (num - i) ; j++)
            {
                if (arr[j-1] > arr[j]) 
                {
                    //Swap Elements
                    temp = (int)arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = (char)temp;
                }
            }
        }
        System.out.println("The sorted names are :");
        for (int i=0; i<num;i++)
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
