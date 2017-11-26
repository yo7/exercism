class Squares
  def initialize side
    @side = side
  end

  def square_of_sum
    (1..@side).sum ** 2
  end

  def sum_of_squares
    (1..@side).map { |i| i**2 }.sum
  end

  def difference
    square_of_sum - sum_of_squares
  end
end

module BookKeeping
  VERSION = 4
end
