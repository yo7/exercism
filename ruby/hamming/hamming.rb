module BookKeeping
  VERSION = 3
end

class Hamming
  def self.compute(dna, other)
    throw ArgumentError if (dna.length != other.length)

    dna.each_char.with_index.reduce(0) { |sum, (c, i)| 
      sum += 1 if c != other[i]
      sum
    }
  end
end
