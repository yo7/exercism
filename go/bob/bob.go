// Package bob implements bob's responds
package bob

import "strings"

type saying string

const alphabet = "abcdefghijklmnopqrstuvwxyz"

// Hey returns respond to given remark
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
	if !strings.ContainsAny(alphabet, strings.ToLower(s)) {
		return false
	}
	if strings.ToUpper(s) != s {
		return false
	}
	return true
}

func isSilent(s string) bool {
	return strings.TrimSpace(string(s)) == ""
}
