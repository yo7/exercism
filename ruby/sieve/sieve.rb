class Sieve
  def initialize(max)
    @numbers = (1..max)
  end

  def primes
    @numbers.select { |i| prime?(i) }
  end

  private

    def prime?(n)
      (1..n).count { |i| n % i == 0 } == 2
    end
end

module BookKeeping
  VERSION = 1
end
