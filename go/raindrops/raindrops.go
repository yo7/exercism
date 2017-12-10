// Package raindrops implements rain sounds conversion
package raindrops

import "strconv"

var sounds = map[int]string{
	3: "Pling",
	5: "Plang",
	7: "Plong",
}

// Convert returns matched rain sounds to given number's factors
func Convert(i int) (s string) {
	f := factors(i)
	for k, v := range sounds {
		if contains(f, k) {
			s += v
		}
	}
	if len(s) == 0 {
		return strconv.Itoa(i)
	}
	return s
}

func factors(n int) (s []int) {
	for i := 1; i <= n; i++ {
		if n%i == 0 {
			s = append(s, i)
		}
	}
	return s
}

func contains(s []int, i int) bool {
	for _, n := range s {
		if i == n {
			return true
		}
	}
	return false
}
