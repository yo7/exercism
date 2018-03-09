class Squares
  def initialize(number)
    @numbers = (1..number)
  end

  def square_of_sum
    @numbers.sum ** 2
  end

  def sum_of_squares
    @numbers.sum { |i| i ** 2 }
  end

  def difference
    square_of_sum - sum_of_squares
  end
end

module BookKeeping
  VERSION = 4
end