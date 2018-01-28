// Package letter implements letter frequency in text
package letter

// FreqMap represents letter frequency
type FreqMap map[rune]int

// Frequency counts letter frequency in text
func Frequency(s string) FreqMap {
	m := FreqMap{}
	for _, r := range s {
		m[r]++
	}
	return m
}

// ConcurrentFrequency counts letter frequency in text
func ConcurrentFrequency(ss []string) FreqMap {
	c := make(chan FreqMap)
	for _, s := range ss {
		go func(s string) { c <- Frequency(s) }(s)
	}
	m := FreqMap{}
	for range ss {
		for r, i := range <-c {
			m[r] += i
		}
	}
	return m
}
