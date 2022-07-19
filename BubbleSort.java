package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {8,9,5,4,7,7,3,2};
	 // Bubble sort
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					// here we will swap with adjacent element
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
 for(int i=0;i<arr.length;i++) {
	 System.out.print(arr[i]+" ");
 }
	}

}
