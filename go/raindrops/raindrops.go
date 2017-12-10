// Package raindrops implements rain sounds conversion
package raindrops

import (
	"sort"
	"strconv"
)

var sounds = map[int]string{
	3: "Pling",
	5: "Plang",
	7: "Plong",
}

// Convert returns matched rain sounds to given number's factors
func Convert(i int) (s string) {
	var keys []int
	for k := range sounds {
		keys = append(keys, k)
	}
	sort.Ints(keys)

	for _, k := range keys {
		if i%k == 0 {
			s += sounds[k]
		}
	}
	if len(s) == 0 {
		return strconv.Itoa(i)
	}
	return s
}
