// Package grains counts grains of wheat on chessboard
package grains

import (
	"errors"
	"math"
)

const squares = 64

// Square counts grains of wheat on the nth square
func Square(i int) (uint64, error) {
	if i < 1 || i > squares {
		return 0, errors.New("input must between 1 and 64")
	}
	num := math.Pow(2, float64(i-1))
	return uint64(num), nil
}

// Total counts total grains of wheat
func Total() uint64 {
	var sum uint64
	for i := 1; i <= squares; i++ {
		n, _ := Square(i)
		sum += n
	}
	return sum
}
