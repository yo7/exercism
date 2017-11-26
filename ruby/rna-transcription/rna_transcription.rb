class Complement
  TRANSCRIPTION = {
    'G' => 'C',
    'C' => 'G',
    'T' => 'A',
    'A' => 'U'
  }

  def self.of_dna(str)
    sequence = str.chars
    return '' unless dna_nucleotides?(sequence)
    sequence.map { |strand| TRANSCRIPTION[strand] }.join
  end

  private

    def self.dna_nucleotides?(sequence)
      sequence.all? { |strand| TRANSCRIPTION.keys.include? strand }
    end
end

module BookKeeping
  VERSION = 4
end
