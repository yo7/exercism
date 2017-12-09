// Package space implements Age in each planet
package space

type Planet string

var orbitalPeriod = map[Planet]float64{
	"Earth":   1.0,
	"Mercury": 0.2408467,
	"Venus":   0.61519726,
	"Mars":    1.8808158,
	"Jupiter": 11.862615,
	"Saturn":  29.447498,
	"Uranus":  84.016846,
	"Neptune": 164.79132,
}

// Age returns age to pass in with specified seconds in given planet
func Age(seconds float64, planet Planet) float64 {
	period, ok := orbitalPeriod[planet]
	if !ok {
		panic("Unknown planet" + planet)
	}
	return calculateYear(seconds, period)
}

func calculateYear(seconds float64, f float64) float64 {
	return earthYearsOf(seconds) / f
}

func earthYearsOf(seconds float64) float64 {
	return seconds / (60 * 60 * 24 * 365.25)
}
