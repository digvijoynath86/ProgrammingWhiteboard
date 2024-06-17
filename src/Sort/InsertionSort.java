package Sort;

public class InsertionSort {
	public static void main(String[] args) {
		
		int[] arr= {8,5,7,3,2};
		int n=arr.length;
		int i;
		int j;
		int x;
		
		// Loop through the elements
		for(i=1;i<n;i++) {
			j=i-1;
			x=arr[i];
			//Loop till left element is greater than the element under comparison
			while(j>-1 && arr[j]>x) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=x;
		}
		//printing all elements
		for(int ele:arr) {
			System.out.println(ele);
		}
	}
}
