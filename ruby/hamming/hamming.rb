require 'pry'

module BookKeeping
  VERSION = 3
end

class Hamming
  def self.compute(first_strand, second_strand)
    throw ArgumentError unless first_strand.length == second_strand.length

    first_strand.each_char.with_index.reject { |c, i| c == second_strand[i] }.length
  end
end

# binding.pry
