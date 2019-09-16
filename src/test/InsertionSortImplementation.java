package test;

public class InsertionSortImplementation {

	
	void sort(int arr[]) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if(arr[j] < arr[j-1]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void main(String args[]) {
		int arr[] = {5,2,3,1,4};
		InsertionSortImplementation obj = new InsertionSortImplementation();
		obj.sort(arr);
		
		printArray(arr);
	}
}
