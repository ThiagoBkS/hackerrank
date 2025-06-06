import java.util.List;

class Solution {
	public static void main(String[] args) {
		List<Integer> array = List.of(1, 3, 5, 7, 9);
		miniMaxSum(array);
	}

	public static void miniMaxSum(List<Integer> array) {
		int minValue = Integer.MAX_VALUE;
		int maxValue = 0;
		long result = 0;

		for (int index = 0; index < array.size(); index++) {
			result += array.get(index);

			if (index >= array.size() - 1)
				break;

			int currentValue = array.get(index);
			int nextValue = array.get(index + 1);

			minValue = Math.min(Math.min(currentValue, nextValue), minValue);
			maxValue = Math.max(maxValue, Math.max(currentValue, nextValue));
		}

		System.out.printf("%s %s", result - maxValue, result - minValue);
	}
}
