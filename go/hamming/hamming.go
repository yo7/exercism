// Package hamming implements Hamming difference
package hamming

import "errors"

// Distance returns difference of two DNA strands
func Distance(strands, other string) (int, error) {
	if len(strands) != len(other) {
		return - 1, errors.New("two strands must have same size DNA")
	}

	count := 0
	for i, c := range strands {
		if string(c) != string(other[i]) {
			count += 1
		}
	}
	return count, nil
}
