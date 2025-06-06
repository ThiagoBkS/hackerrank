import java.util.List;

class Solution {
	public static void main(String[] args) {
		List<List<Integer>> array = List.of(
				List.of(11, 2, 4),
				List.of(4, 5, 6),
				List.of(10, 8, -12));

		int result = diagonalDifference(array);
		System.out.println(result);
	}

	public static int diagonalDifference(List<List<Integer>> array) {
		int leftDiagonal = 0;
		int rightDiagonal = 0;
		int rows = array.size() - 1;

		for (int index = 0; index <= rows; index++) {
			leftDiagonal += array.get(index).get(index);
			rightDiagonal += array.get(index).get(rows - index);
		}

		return Math.abs(leftDiagonal - rightDiagonal);
	}
}
