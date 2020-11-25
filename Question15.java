import java.util.Scanner;
class Question15
{ 
    int arr[]=new int[8];
    int temp,rem;
    void init()
    {
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<8;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void calcAndDisplay()
    {
        for(int i=0;i<8;i++)
        {
            temp=arr[i];
            rem=temp%10;
            if(rem==3)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String args[])
    {
        Question15 obj=new Question15();
        obj.init();
        obj.calcAndDisplay();
    }
} 
