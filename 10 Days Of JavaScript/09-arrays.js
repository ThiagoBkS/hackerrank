/**
 *   Return the second largest number in the array.
 *   @param {Number[]} nums - An array of numbers.
 *   @return {Number} The second largest number in the array.
 **/
function getSecondLargest(nums) {
	// Complete the function
	let firstLargest = 0;
	let secondLargest = 0;

	for (let num of nums) {
		if (num > firstLargest) {
			secondLargest = firstLargest;
			firstLargest = num;
		} else if (num < firstLargest && num > secondLargest) secondLargest = num;
	}

	return secondLargest;
}

console.log(getSecondLargest([2, 3, 6, 6, 5]));
