function getMaxLessThanK(n, k) {
	let max = 0;
	for (let i = 1; i < n; i++) {
		for (let j = i + 1; j <= n; j++) {
			let val = i & j;
			if (val < k && val > max) {
				max = val;
			}
		}
	}

	return max;
}
