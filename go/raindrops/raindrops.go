// Package raindrops implements rain sounds conversion
package raindrops

import (
	"strconv"
)

type rainDrop struct {
	Factor int
	Sound  string
}

var drops = []rainDrop{
	{Factor: 3, Sound: "Pling"},
	{Factor: 5, Sound: "Plang"},
	{Factor: 7, Sound: "Plong"},
}

// Convert returns matched rain sounds to given number's factors
func Convert(i int) (s string) {
	for _, drop := range drops {
		if i%drop.Factor == 0 {
			s += drop.Sound
		}
	}
	if s == "" {
		return strconv.Itoa(i)
	}
	return s
}
