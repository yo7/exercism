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
      FACTOR_STRINGS.each_with_object('') { |(k, v), s| s << v if factors.include?(k) }
    end

    def self.factors(n)
      (1..n).each_with_object([]) { |i, a| a << i if (n % i).zero? }
    end
end

module BookKeeping
  VERSION = 3
end
