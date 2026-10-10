package Demo;
public class jumpSearch {

    static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int blockSize = (int) Math.sqrt(n);

        int start = 0;
        int end = blockSize;

        // Finding the block where the element is present
        while (start < n && arr[Math.min(end, n) - 1] < target) {
            start = end;
            end += blockSize;
            if (start >= n) {
                return -1;
            }
        }

        // Performing linear search within the identified block
        for (int i = start; i < Math.min(end, n); i++) {
            if (arr[i] == target) {
                return i; // Return the index of the found element
            }
        }

        return -1; // Target not found
    }
    public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80,90,100};
		int target=70;
		System.out.println(jumpSearch(arr,target));
	}
}
	


