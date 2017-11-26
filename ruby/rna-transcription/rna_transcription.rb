class Complement
  TRANSCRIPTION = {
    'G' => 'C',
    'C' => 'G',
    'T' => 'A',
    'A' => 'U'
  }

  def self.of_dna(sequence)
    seq = sequence.chars
    return '' if seq.any? { |strand| !TRANSCRIPTION.keys.include? strand }
    seq.map { |strand| TRANSCRIPTION[strand] }.join
  end
end

module BookKeeping
  VERSION = 4
end
