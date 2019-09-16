package test;

public class SelectionSortImplementation {
	
	void sort(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			int min_idx = i;
			for (int j = i +1; j<arr.length; j++) {
				if(arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			//perform swap
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}
	
	void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		SelectionSortImplementation ob = new SelectionSortImplementation();
		int arr[] = {4,3,5,2,1};
		ob.sort(arr);
		System.out.println("Sorted Array");
		ob.printArray(arr);
	}

}
