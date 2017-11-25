require 'pry'

module BookKeeping
  VERSION = 3
end

class Hamming
  def self.compute(dna, other)
    throw ArgumentError if (dna.length != other.length)

    dna.each_char.with_index.reject { |c, i| c == other[i] }.length
  end
end

# binding.pry
