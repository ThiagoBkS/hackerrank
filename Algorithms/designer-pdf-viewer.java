import java.util.List;

class Solution {
	public static void main(String[] args) {
		System.out.println(designerPdfViewer(
				List.of(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7), "zaba"));
	}

	public static int designerPdfViewer(List<Integer> heights, String word) {
		int startAscii = 97;
		int biggest = 0;

		for (char character : word.toCharArray()) {
			int index = Integer.valueOf(character) - startAscii;
			int value = heights.get(index);

			if (value > biggest)
				biggest = value;
		}

		return word.length() * biggest;
	}
}
