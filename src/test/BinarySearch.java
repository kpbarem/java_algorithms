package test;

public class BinarySearch {
	
	int binarySearch(int arr[], int low, int high, int search) {
		if (high >=low) {
			int mid = low + (high-low)/2;
			if(arr[mid] == search) {
				return mid;
			}
			if (arr[mid] > search) {
				return binarySearch(arr, low, mid-1, search);
			}
			return binarySearch(arr, mid+1, high, search);
		}
		return -1;
	}
	public static void main(String[]args) {
		BinarySearch obj = new BinarySearch();
		
		int arr[] = {2,5,8,10,15,20,30};
		int high = arr.length -1;
		int result = obj.binarySearch(arr, 0, high, 8);
		
		if (result == -1) {
			System.out.println("Element not present");
		} else {
			System.out.println("Element found at index " + result);
		}
	}
}
