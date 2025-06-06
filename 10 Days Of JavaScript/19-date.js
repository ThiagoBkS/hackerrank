// The days of the week are: "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
function getDayName(dateString) {
	// Write your code here
	const date = new Date(dateString);
	let dayName = date.toLocaleDateString("EN-us", { weekday: "long" });

	return dayName;
}
