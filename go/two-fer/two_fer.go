// Package twofer implements 'two for one' text
package twofer

import "fmt"

// ShareWith returns 2-fer text for given name
func ShareWith(name string) string {
	if name == "" {
		name = "you"
	}
	return fmt.Sprintf("One for %s, one for me.", name)
}
