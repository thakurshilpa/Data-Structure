// Java implementation of iterative Binary Search 
class BinarySearch { 
	// Returns index of x if it is present in arr[], 
	// else return -1 
	int binarySearch(int arr[], int x) 
	{ 
		int low=0;
        int high=arr.length;
      while(low<=high)
      {
      int mid=(high+low)/2;
        System.out.println(mid + " "+low+ " "+high);
        if(arr[mid]==x)
        {
          return mid;
        }
        else if(arr[mid]<x)
        {low=mid+1;}
        else
        {
        high=mid-1;}
      }
      return -1;
	} 

	// Driver method to test above 
	public static void main(String args[]) 
	{ 
		BinarySearch ob = new BinarySearch(); 
		int arr[] = { 2, 3, 4, 10, 40 }; 
		int n = arr.length; 
		int x = 10; 
		int result = ob.binarySearch(arr, x); 
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at "
							+ "index " + result); 
	} 
} 

