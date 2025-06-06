import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public static void main(String[] args) {
		compareTriplets(List.of(5, 6, 7), List.of(3, 6, 10));
	}

	public static List<Integer> compareTriplets(List<Integer> tripletA, List<Integer> tripletB) {
		List<Integer> scores = new ArrayList<>(Arrays.asList(0, 0));

		for (int index = 0; index < 3; index++) {
			int aScore = tripletA.get(index);
			int bScore = tripletB.get(index);

			if (aScore > bScore)
				scores.set(0, scores.get(0) + 1);
			else if (aScore < bScore)
				scores.set(1, scores.get(1) + 1);
		}

		return scores;
	}
}
