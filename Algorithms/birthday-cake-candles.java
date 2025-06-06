import java.util.List;

class Solution {
	public static void main(String[] args) {
		System.out.println(birthdayCakeCandles(List.of(3, 2, 1, 3)));
	}

	public static int birthdayCakeCandles(List<Integer> candles) {
		int bigger = 0;
		int count = 0;

		for (int index = 0; index < candles.size(); index++) {
			if (candles.get(index) == bigger)
				count++;
			else if (candles.get(index) > bigger) {
				bigger = candles.get(index);
				count = 1;
			}
		}

		return count;
	}
}
