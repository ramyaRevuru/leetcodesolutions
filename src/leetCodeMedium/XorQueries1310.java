package leetCodeMedium;

public class XorQueries1310 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input: arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]
		// Output: [2,7,14,8]
		int[] arr = { 4, 8, 2, 10 };
		int[][] queries = { { 2, 3 }, { 1, 3 }, { 0, 0 }, { 0, 3 } };
		int[] result = xorQueries(arr, queries);
		for (int num : result) {
			System.out.print(num + " ");
		}
	}

	public static int[] xorQueries(int[] arr, int[][] queries) {
		int[] result = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			int start = queries[i][0];
			int end = queries[i][1];
			int resultXor = arr[start];
			for (int j = start + 1; j <= end; j++) {
				resultXor ^= arr[j];
			}
			result[i] = resultXor;
		}

		return result;

	}

}
