package Sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 10, 16, 8, 12, 15, 6, 3, 9, 5 };
		int low = 0;
		int high = arr.length-1;

		BubbleSort bs = new BubbleSort();
		int partitionPos=partition(bs, arr, low, high);
		//System.out.println(partitionPos);
		int[] res=quickSort(bs,arr,low,high);
		
		for(int element:res) {
			System.out.println(element);
		}
		

	}
	
	public static int[] quickSort(BubbleSort bs,int[] arr,int low, int high) {
		if(low<high) {
			int j=partition(bs,arr, low,high);
			//System.out.println(j);
			quickSort(bs, arr, low,j);
			quickSort(bs,arr,j+1,high);
			
		}
		return arr;
	}

	public static int partition(BubbleSort bs, int[] arr, int low, int high) {
		int j = high+1;
		int i = low;
		int pivot = arr[low];

		while (i < j) {
			do {
				i++;
			} while (arr[i] <= pivot);

			do {
				j--;
			} while (arr[j] > pivot);

			if (i < j) {
				BubbleSort.swap(arr, i, j);
			}

		}
		BubbleSort.swap(arr, low, j);

		return j;
	}
}
