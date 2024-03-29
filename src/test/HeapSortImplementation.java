package test;

public class HeapSortImplementation {
	
	private static int N;
	
	
	public static void sort(int arr[]) {
		heapify(arr);
		for (int i = N; i > 0; i--) {
			swap(arr, 0, i);
			N=N-1;
			maxHeap(arr, 0);
		}
	}
	
	public static void heapify(int arr[]) {
		N = arr.length-1;
		for (int i = N/2; i >= 0; i--) {
			maxHeap(arr, i);
		}
	}
	
	//0,1, 2,3,4,5
	//6,11,4,1,3,7
	public static void maxHeap(int arr[], int i) {
		int left = 2*i;
		int right = 2*i + 1;
		int max = i;
		if (left <= N && arr[left] > arr[i]) {
			max = left;
		}
		if (right <= N && arr[right] > arr[max]) {
			max = right;
		}
		
		if (max != i) {
			swap(arr, i, max);
			maxHeap(arr, max);
		}
	}
	
	public static void swap(int arr[], int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main (String[] args) {
		int arr[] = {6,11,4,1,3,7};
		sort(arr);
		System.out.println("\nElements after sorting ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
}
