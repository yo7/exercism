module BookKeeping
  VERSION = 3
end

class Hamming
  def self.compute(first_strand, second_strand)
    raise ArgumentError.new("Two strands must be same size") unless first_strand.length == second_strand.length

    first_strand.each_char.with_index.count { |c, i| c != second_strand[i] }
  end
end
