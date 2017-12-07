// Package gigasecond implements gigasecond calculation
package gigasecond

import "time"

const gigasecond = time.Second * time.Duration(1000000000)

// AddGigasecond adds gigasecond to a given time
func AddGigasecond(t time.Time) time.Time {
	return t.Add(gigasecond)
}
