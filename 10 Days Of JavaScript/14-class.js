/*
 * Implement a Polygon class with the following properties:
 * 1. A constructor that takes an array of integer side lengths.
 * 2. A 'perimeter' method that returns the sum of the Polygon's side lengths.
 */

class Polygon {
	constructor(lenghts) {
		this.lenghts = lenghts;
	}

	perimeter() {
		let total = 0;
		for (let length of this.lenghts) total += length;

		return total;
	}
}
