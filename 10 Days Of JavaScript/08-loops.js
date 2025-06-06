/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
	const vowels = "aeiou";

	for (let charIndex = 0; charIndex < s.length; charIndex++)
		if (vowels.includes(s[charIndex])) console.log(s[charIndex]);

	for (let charIndex = 0; charIndex < s.length; charIndex++)
		if (!vowels.includes(s[charIndex])) console.log(s[charIndex]);
}
