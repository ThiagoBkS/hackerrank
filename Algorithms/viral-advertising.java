class Solution {
	public static void main(String[] args) {
		int result = viralAdvertising(5);
		System.out.println(result);
	}

	public static int viralAdvertising(int days) {
		int shares = 5;
		int cumulative = 0;

		for (int day = 0; day < days; day++) {
			int likes = shares / 2;
			cumulative += likes;
			shares = likes * 3;
		}

		return cumulative;
	}
}
