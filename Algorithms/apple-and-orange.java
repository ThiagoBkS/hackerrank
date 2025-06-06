import java.util.List;

class Solution {
	public static void main(String[] args) {
		countApplesAndOranges(7, 11, 5, 15, List.of(-2, 2, 1), List.of(5, -6));
	}

	public static void countApplesAndOranges(int samHouseStartX, int samHouseEndX, int appleTreeX, int orangeTreeX,
			List<Integer> applesX, List<Integer> orangesX) {
		int biggestList = Math.max(applesX.size(), orangesX.size());
		int apples = 0;
		int oranges = 0;

		for (int index = 0; index < biggestList; index++) {
			if (index < applesX.size()) {
				int appleX = applesX.get(index) + appleTreeX;
				if (appleX >= samHouseStartX && appleX <= samHouseEndX)
					apples++;
			}

			if (index < orangesX.size()) {
				int orangeX = orangesX.get(index) + orangeTreeX;
				if (orangeX >= samHouseStartX && orangeX <= samHouseEndX)
					oranges++;
			}
		}

		System.out.println(apples);
		System.out.println(oranges);
	}
}
