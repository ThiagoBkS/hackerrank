import java.util.List;

class Solution {
	public static void main(String[] args) {
		List<Integer> array = List.of(2, 4, 6);
		bonAppetit(array, 2, 6);
	}

	public static void bonAppetit(List<Integer> bill, int notEaten, int contributed) {
		int splitValue = 0;

		for (int index = 0; index < bill.size(); index++)
			if (index != notEaten)
				splitValue += bill.get(index);

		splitValue /= 2;

		if (splitValue == contributed)
			System.out.println("Bon Appetit");
		else
			System.out.println(contributed - splitValue);
	}
}
