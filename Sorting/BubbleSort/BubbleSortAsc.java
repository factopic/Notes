package Sorting.BubbleSort;

public class BubbleSortAsc {

	public static void bubbleSortAsc(int[] arr)
	{
		int n = arr.length;
		int temp = 0;
		
		for(int i=0; i<=n; i++)
		{
			for(int j=1; j<n-i; j++)
			{
				if(arr[j-1]> arr[j])
				{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	
	
	public static void main(String[] args)
	{
		int[] arr = {1,8,3,4,7,2};
		
		System.out.println( " Array Before Sorting ");

        for(int i=0; i < arr.length; i++)
        {  
            System.out.print(arr[i] + " ");  
        }  
		
		System.out.println();
		
		bubbleSortAsc(arr);
		
		System.out.println( " Array After Sorting ");
		
        for(int i=0; i < arr.length; i++)
        {  
            System.out.print(arr[i] + " ");  
        }  
		
		
		
	}
}
