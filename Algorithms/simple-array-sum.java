import java.util.List;

class Solution {
	public static void main(String[] args) {
		int result = simpleArraySum(List.of(1, 2, 3));
		System.out.println(result);
	}

	public static int simpleArraySum(List<Integer> array) {
		return array.stream()
				.reduce(0, (n1, n2) -> n1 + n2);
	}
}