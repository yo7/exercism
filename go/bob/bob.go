// Package bob implements bob's responses
package bob

import "strings"

type saying string

const alphabet = "abcdefghijklmnopqrstuvwxyz"

// Hey returns response to given remark
func Hey(remark string) string {
	switch {
	case isQuestion(remark) && isShout(remark):
		return "Calm down, I know what I'm doing!"
	case isQuestion(remark):
		return "Sure."
	case isShout(remark):
		return "Whoa, chill out!"
	case isSilent(remark):
		return "Fine. Be that way!"
	default:
		return "Whatever."
	}
}

func isQuestion(s string) bool {
	return strings.HasSuffix(strings.TrimSpace(s), "?")
}

func isShout(s string) bool {
	return strings.ContainsAny(alphabet, strings.ToLower(s)) && strings.ToUpper(s) == s
}

func isSilent(s string) bool {
	return strings.TrimSpace(s) == ""
}
