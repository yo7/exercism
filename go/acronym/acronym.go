// Package acronym package implements abbreviation to acronym
package acronym

import "strings"

// Abbreviate converts a phrase to its anconym
func Abbreviate(s string) (acronym string) {
	for _, word := range strings.FieldsFunc(s, split) {
		acronym += strings.ToUpper(string(word[0]))
	}
	return acronym
}
func split(r rune) bool {
	return r == ' ' || r == '-'
}
