// Package hamming implements Hamming difference
package hamming

import "errors"

// Distance returns difference of two DNA strands
func Distance(s1, s2 string) (int, error) {
	if len(s1) != len(s2) {
		return -1, errors.New("two strands must have same size DNA")
	}

	count := 0
	for i, c := range s1 {
		if byte(c) != s2[i] {
			count += 1
		}
	}
	return count, nil
}
