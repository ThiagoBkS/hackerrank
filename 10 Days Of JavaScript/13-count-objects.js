/*
 * Return a count of the total number of objects 'o' satisfying o.x == o.y.
 *
 * Parameter(s):
 * objects: an array of objects with integer properties 'x' and 'y'
 */
function getCount(objects) {
	let satisfyObjects = 0;

	for (let object of objects) if (object.x === object.y) satisfyObjects++;

	return satisfyObjects;
}
