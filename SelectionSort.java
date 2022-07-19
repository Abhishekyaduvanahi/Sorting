package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {4,7,6,5,7,8,9,2,3,1};
		for(int i=0;i<arr.length;i++) {
			int smallest =i;
			for(int j=1;j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		
		}
		for(int i=0;i<arr.length;i++) {
	       	 System.out.print(arr[i]+" ");
		}
         }
		

}
