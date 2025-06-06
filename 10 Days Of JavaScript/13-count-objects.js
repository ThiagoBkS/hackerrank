/*
 * Return a count of the total number of objects 'o' satisfying o.x == o.y.
 *
 * Parameter(s):
 * objects: an array of objects with integer properties 'x' and 'y'
 */
function getCount(objects) {
	let satisfyObjects = 0;

	for (let object of objects) {
		const { x, y } = object;
		if (x === y) satisfyObjects++;
	}

	return satisfyObjects;
}

getCount([
	{ x: 1, y: 1 },
	{ x: 2, y: 3 },
	{ x: 3, y: 3 },
	{ x: 3, y: 4 },
	{ x: 4, y: 5 },
]);
