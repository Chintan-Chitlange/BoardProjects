import java.util.Scanner;
import java.util.Arrays;
public class Question14
{
    int arr[]=new int[5];
    void init()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the temprature of 5 cities");
        for (int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void part2()
    {
        Arrays.sort(arr);
        System.out.println(" ");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+"\n");
        }
    }
    public static void main()
    {
        Question14 obj=new Question14();
        obj.init();
        obj.part2();
    }
}