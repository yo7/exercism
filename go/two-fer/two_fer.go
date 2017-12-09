// Package twofer implements 'two for one' text
package twofer

// ShareWith returns 2-fer text for given name
func ShareWith(name string) string {
	if name == "" {
		name = "you"
	}
	return "One for " + name + ", one for me."
}
