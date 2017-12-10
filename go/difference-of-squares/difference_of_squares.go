// Package diffsquares implements calculation of square of sums, sum of squares, and difference between the two
package diffsquares

// Difference calculate difference between square of sum and sum of square
func Difference(i int) int {
	return SquareOfSums(i) - SumOfSquares(i)
}

// SquareOfSums squares sum of natural numbers to given number
func SquareOfSums(num int) int {
	var n int
	for i := 1; i <= num; i++ {
		n += i
	}
	return n * n
}

// SumOfSquares sums square of natural numbers to given number
func SumOfSquares(num int) int {
	var n int
	for i := 1; i <= num; i++ {
		n += i * i
	}
	return n
}
