/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */

function vowelsAndConsonants(string) {
	const vowelsMapped = "aeiou";

	for (let charIndex = 0; charIndex < string.length; charIndex++)
		if (vowelsMapped.includes(string[charIndex])) console.log(string[charIndex]);

	for (let charIndex = 0; charIndex < string.length; charIndex++)
		if (!vowelsMapped.includes(string[charIndex])) console.log(string[charIndex]);
}

vowelsAndConsonants("javascriptloops");
