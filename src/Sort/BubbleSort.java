package Sort;

public class BubbleSort {
	public static void main(String args[]) {
		int[] arr = { 8, 5, 7, 3, 2 };
		int n = arr.length;
		int flag;
		
		// Method call to get highest number in the array
		//int highestElement=findHighestElement(arr);
		//System.out.println(highestElement);

		for (int i = 0; i < n - 1; i++) {
			flag = 0;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					arr = swap(arr, j, j + 1);
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}

		for (int k : arr) {
			System.out.println(k);
		}
	}
	//Method to swap elements
	public static int[] swap(int[] arr, int pos1, int pos2) {
		int temp = arr[pos1];

		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
		return arr;
	}
	// We can find the highest, 2 highest, 3 highest numbers in array by bubble sort. Every pass makes the highest number
	// at the bottom. So hard code the number of passed
	public static int findHighestElement(int [] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			if (arr[i] > arr[i + 1]) {
				arr = swap(arr, i, i + 1);
				
			}
		}
		return arr[arr.length-1];
	}
}
