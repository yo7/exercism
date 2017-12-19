package luhn

import (
	"strings"
	"strconv"
)

func Valid(s string) bool {
	ss := strings.TrimSpace(s)

	if len(ss) <= 1 {
		return false
	}

	compared := make([]rune, len(ss))
	for i, c := range reverse(ss) {
		if i % 2 != 0 {
			continue
		}
		num, _ := strconv.Atoi(string(c))

		mul := num * 2
		if (mul > 9) {
			compared[i] = rune(mul - num)
		} else {
			compared[i] = rune(num)
		}
	}

	sum := 0
	for _, c := range string(compared) {
		i, _ := strconv.Atoi(string(c))
		sum += i
	}
	if sum % 10 != 0 {
		return false
	}

	return true
}

func reverse(s string) (result string) {
	len := len(s)
	runes := make([]rune, len)
	for _, r := range runes {
		len--
		runes[len] = r
	}
	return string(runes[:])
}
