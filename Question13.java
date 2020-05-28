import java.util.Scanner;
class Question13{
	public static int binarySearch(int arr[], int first, int last, int key)
	{
	    if (last>=first)
	    {
		int mid = first + (last - first)/2;
		if (arr[mid] == key)
		{
		     return mid;
                }
                if (arr[mid] > key)
                {
			return binarySearch(arr, first, mid-1, key);//search in left subarray
                }
                else
                {
			return binarySearch(arr, mid+1, last, key);//search in right subarray
                }
            }
            return -1;
	}
	public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
	    int arr[] = {1982,1987,1993,1996,1999,2003,2006,2007,2009,2010};
	    int key = sc.nextInt();
            int last=arr.length-1;
	    int result = binarySearch(arr,0,last,key);
	    if (result == -1)
	        System.out.println("Element is not found!");
	    else
		System.out.println("Element is found at index: "+result);
	}
}