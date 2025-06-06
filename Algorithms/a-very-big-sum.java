import java.util.List;

class Solution {
	public static void main(String[] args) {
		List<Long> array = List.of(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L);

		long result = aVeryBigSum(array);
		System.out.println(result);
	}

	public static long aVeryBigSum(List<Long> array) {
		return array.stream()
				.reduce(0L, (n1, n2) -> n1 + n2);
	}
}
