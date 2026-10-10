package Demo;

public class spaceComplexityLinearSpace {
	static int[] copyArray(int[] arr) {
		int[] result=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			result[i]=arr[i];
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int[] result=copyArray(arr);
		System.out.println("copird array");
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
}

		


