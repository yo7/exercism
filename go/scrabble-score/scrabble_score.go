// Package scrabble implements score for scrabble
package scrabble

import "strings"

var letters = map[string]int{
	"AEIOULNRST": 1,
	"DG":         2,
	"BCMP":       3,
	"FHVWY":      4,
	"K":          5,
	"JX":         8,
	"QZ":         10,
}

// Score calculates score for given phrase
func Score(s string) (score int) {
	for _, c := range strings.ToUpper(s) {
		for k, v := range letters {
			if strings.ContainsAny(string(c), k) {
				score += v
			}
		}
	}
	return score
}
