// Package clock represents clock without date
package clock

import (
	"fmt"
)

// Clock with hour and minute
type Clock struct {
	hour   int
	minute int
}

// New returns new clock with hour and minute
func New(hour, minute int) Clock {
	h, m := calc(hour, minute)
	return Clock{
		hour:   h,
		minute: m,
	}
}

// Add add minutes to clock, or subtract minutes by negative values
func (c Clock) Add(minutes int) Clock {
	return New(c.hour, c.minute+minutes)
}

func (c Clock) String() string {
	return fmt.Sprintf("%02d:%02d", c.hour, c.minute)
}

func calc(hour, minute int) (h int, m int) {
	m = minute % 60
	if m < 0 {
		m += 60
		hour--
	}
	h = (hour + (minute / 60)) % 24
	if h < 0 {
		h += 24
	}
	return
}
