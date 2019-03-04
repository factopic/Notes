package Sorting.SelectionSort;

public class SelectionSort 
{

	public static void selectionSort(int[] arr)
	{
		
		for(int i=0; i<arr.length; i++)
		{
			int index = i;
			for(int j=i+1; j<arr.length; j++)
			{
				if( arr[index] > arr[j] )
				{
					index = j;
				}
				
				int small =  arr[index];
				arr[index] = arr[i];
				arr[i] = small;
				
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		int[] arr = {1,8,3,4,7,8,2,10,1};
		
		System.out.println( " Array Before Bubble Sorting ");

        for(int i=0; i < arr.length; i++)
        {  
            System.out.print(arr[i] + " ");  
        }  
		
		System.out.println();
		
		selectionSort(arr);
		
		System.out.println( " Array After Bubble Sorting ");
		
        for(int i=0; i < arr.length; i++)
        {  
            System.out.print(arr[i] + " ");  
        }  
		
		
		
	}
	
	
	
	
	
}
