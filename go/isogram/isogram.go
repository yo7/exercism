// Package isogram implements isogram checking
package isogram

import (
	"regexp"
	"strings"
)

// IsIsogram checks if a given phrase is isogram
func IsIsogram(phrase string) bool {
	r := regexp.MustCompile("[a-z]")
	s := strings.ToLower(phrase)
	alphabets := strings.Join(r.FindAllString(s, -1), "")

	for _, c := range s {
		if strings.Count(alphabets, string(c)) > 1 {
			return false
		}
	}
	return true
}
