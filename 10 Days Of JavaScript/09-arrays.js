/**
 *   Return the second largest number in the array.
 *   @param {Number[]} nums - An array of numbers.
 *   @return {Number} The second largest number in the array.
 **/
function getSecondLargest(nums) {
	// Complete the function

	let firstLargestNum = 0;
	let secondLargestNum = 0;

	for (let num of nums) {
		if (num > firstLargestNum) {
			secondLargestNum = firstLargestNum;
			firstLargestNum = num;
		} else if (num < firstLargestNum && num > secondLargestNum) secondLargestNum = num;
	}

	return secondLargestNum;
}
