// Package bob implements bob's responds
package bob

import "strings"

type saying string

const alphabet = "abcdefghijklmnopqrstuvwxyz"

func (s saying) isShout() bool {
	ss := string(s)
	if !strings.ContainsAny(alphabet, strings.ToLower(ss)) {
		return false
	}
	if strings.ToUpper(ss) != ss {
		return false
	}
	return true
}

func (s saying) isQuestion() bool {
	ss := string(s)
	return strings.HasSuffix(strings.TrimSpace(ss), "?")
}

func (s saying) isSilent() bool {
	return strings.TrimSpace(string(s)) == ""
}

// Hey returns respond to given remark
func Hey(remark string) string {
	s := saying(remark)
	if s.isQuestion() && s.isShout() {
		return "Calm down, I know what I'm doing!"
	} else if s.isQuestion() {
		return "Sure."
	} else if s.isShout() {
		return "Whoa, chill out!"
	} else if s.isSilent() {
		return "Fine. Be that way!"
	} else {
		return "Whatever."
	}
}
