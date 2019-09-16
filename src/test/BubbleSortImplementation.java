package test;

public class BubbleSortImplementation {
	
	void bubbleSort(int arr[]) {
		int n = arr.length;
		
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					//perform swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	void printArray(int arr[]) {
		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i] + " ");
			System.out.println();
		}
	}
	
	public static void main (String[] args) {
		BubbleSortImplementation ob = new BubbleSortImplementation();
		int arr[] = {4,3,5,2,1};
		ob.bubbleSort(arr);
		
		ob.printArray(arr);
	}

}
