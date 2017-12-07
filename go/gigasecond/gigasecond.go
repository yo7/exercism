// Package gigasecond implements gigasecond calculation
package gigasecond

import "time"

// AddGigasecond adds gigasecond to a given time
func AddGigasecond(t time.Time) time.Time {
	gigasecond := time.Duration(time.Second * 1000000000)
	return t.Add(gigasecond)
}
