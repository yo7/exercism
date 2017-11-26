class Raindrops
  FACTOR_STRINGS = {
    3 => 'Pling',
    5 => 'Plang',
    7 => 'Plong'
  }

  def self.convert n
    s = stringify(factors(n))
    s.empty? ? n.to_s : s
  end

  private
    def self.stringify(factors)
      factors.map { |factor| FACTOR_STRINGS[factor] }.join
    end

    def self.factors(n)
      (1..n).select { |i| (n % i).zero? }
    end
end

module BookKeeping
  VERSION = 3
end
