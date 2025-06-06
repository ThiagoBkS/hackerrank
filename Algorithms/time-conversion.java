class Solution {
	public static void main(String[] args) {
		String result = timeConversion("01:05:45AM\n");
		System.out.println(result);
	}

	public static String timeConversion(String time) {
		int hours = Integer.parseInt(time.substring(0, 2));
		String minutesAndSeconds = time.substring(3, 8);
		String meridien = time.substring(8, 10);

		if (meridien.equals("PM")) {
			if (hours < 12)
				hours += 12;
			return String.format("%s:%s", hours, minutesAndSeconds);
		} else {
			String formated = "";
			if (hours >= 12)
				hours -= 12;
			if (hours < 10) {
				formated += "0";
				formated += Integer.toString(hours);
			}

			return String.format("%s:%s", formated, minutesAndSeconds);
		}
	}
}
